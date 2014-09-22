package InnerClass;

import java.util.ArrayList;

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class Sequence {
	private ArrayList<Object> items;
	private int next = 0;

	public Sequence(int sizeD) {
		items = new ArrayList<Object>();
	}

	public void add(Object x) {
//		if (next < items.size())
//			items[next++] = x;
			items.add(x);
			next++;
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.size();
		}

		public Object current() {
			return items.get(i);
		}

		public void next() {
			if (i < items.size())
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		System.out.println("start");
		Sequence sequence = new Sequence(5);
		for (int i = 0; i < 5; i++){
			System.out.println("for add");
//			sequence.add(Integer.toString(i));}
			sequence.add(Integer.toString(i));}
		Selector selector = sequence.selector();
//		sequence.
		while (!selector.end()) {
			System.out.println("while selector");
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}