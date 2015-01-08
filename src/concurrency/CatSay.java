package concurrency;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CatSay implements  Runnable {
	protected int dieAge = 15;
	private int i=0;
	private static int catCount =0;
	private final int id = catCount++;
	CatSay(){}

	public void run() {
		while(++this.i < dieAge){
			System.out.println("I am cat №" + id + " and I am " + i);
			Thread.yield();
		}
		System.out.println("Cat №" + id + " is dead now.");
		return;
	}
	
	public static void main(String[] args) {
//		System.out.println("go");
//		Date d = new Date();
//		long time_begin = d.getTime();		
		ExecutorService exec = Executors.newFixedThreadPool(1);
		for (int i = 0; i < 5; i++) {
//			Thread g = new Thread(new CatSay());
//			g.start();
			exec.execute(new CatSay());
		}
		
//		System.out.println("time: " + (time_begin - d.getTime()));
//		CatSay c = new CatSay();
//		c.run();
//		System.out.println("end");
	}
}