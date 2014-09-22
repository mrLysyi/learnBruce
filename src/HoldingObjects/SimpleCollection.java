package HoldingObjects;

import java.util.*;

import javax.print.attribute.SetOfIntegerSyntax;

import com.sun.jmx.remote.internal.ArrayQueue;

import first.Array;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		Collection<Integer> cc = new ArrayQueue<Integer>(2);
		
		Set<Integer> ccc = new TreeSet<Integer>();
		
		for (int i = 0; i < 10; i++)
			ccc.add(i); // Autoboxing
		ccc.add(8);
		
		for (Integer i : ccc)
			System.out.print(i + ", ");
	}
}