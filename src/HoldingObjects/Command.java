package HoldingObjects;

import java.util.*;

class fillQueue {
	public static Queue fill() {
		Queue<Command> queue = new LinkedList<Command>();
		queue.add(new Command("first"));
		queue.add(new Command("second"));
		queue.add(new Command("third"));
		queue.add(new Command("fourth"));
		queue.add(new Command("fifth"));
		return queue;
	}
}

class Consumer {
	public static void consumer(){
		Queue<Command> queue =  new LinkedList<Command>();
	queue = fillQueue.fill();
	System.out.println(queue.size());
	
	Iterator<Command> it = queue.iterator();
	while(it.hasNext())
	it.next().operation();
	System.out.println("GameOver");
//	while (it.hasNext()){
//		queue.co
//	}
}
}

public class Command {
	private String str = "some string";

	Command(String str) {
		this.str = str;
	}

	void operation() {
		System.out.println(str);
	}
	public static void main(String[] args) {
		Consumer.consumer();
		
	}

}
