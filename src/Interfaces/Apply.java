package Interfaces;

interface Processor {
	String name();

	Object process(Object input);
} // /:~
// : interfaces/interfaceprocessor/Apply.java

public class Apply {
	public static void process(Processor p, Object s) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
}