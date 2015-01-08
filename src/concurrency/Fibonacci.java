package concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import net.mindview.util.*;

public class Fibonacci implements Generator<Integer>, Callable<Integer> { // Runnable,
	private int count = 0;
	private int numberOfTusks;

	public Fibonacci(int numberOfTusks) {
		this.numberOfTusks = numberOfTusks;
	}

	public Integer next() {
		return fib(count++);
	}

	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

	public static void main(String[] args) {
		// Fibonacci gen = new Fibonacci();
		// for (int i = 0; i < 18; i++)
		// System.out.print(gen.next() + " ");
		// Fibonacci f = new Fibonacci();
		// System.out.println(f.fib(17));
		ArrayList<Future<Integer>> arr = new ArrayList<Future<Integer>>();
		ExecutorService exec = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			arr.add(exec.submit(new Fibonacci(30)));
			 Thread t = new Thread((Runnable) new Fibonacci(30));
			 t.setDaemon(true);
//			 t.start();
		}
		for (Future<Integer> f : arr) {
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				exec.shutdown();
			}

		}

	}

	// @Override
	// public void run() {
	// Fibonacci gen = new Fibonacci(numberOfTusks);
	// for (int i = 0; i < numberOfTusks; i++)
	// System.out.print(gen.next() + " ");
	// Thread.yield();
	//
	// }

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		int temp = 0;
		Fibonacci gen = new Fibonacci(numberOfTusks);
		for (int i = 0; i < numberOfTusks; i++) {
			temp = gen.next();
			// System.out.print(temp + " ");
			sum += temp;
		}
		Thread.sleep(100);
		return sum;
	}
}
