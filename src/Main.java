import java.util.Random;

//import static first.debug.DebugOne.debug;
import first.Array;
import first.BinaryTest;
import first.Constructor;
import first.DetectPrime;
import first.Dog;
import first.Hello;
import first.Rand;
//import first.StaticInit;
import first.StringNull;
import first.Swich;
import first.ConectionManager;

interface lol{}
//static  class cl{}
class Parent {
	public void methodToOverride() {
		System.out.println("parent method");
	}

	public static void methodToHide() {
		System.out.println("parent method to hide");
	}
}

class Child extends Parent {
	@Override
	public void methodToOverride() {
		System.out.println("child method");
	}

	public static void methodToHide() {
		System.out.println("child method to hide");
	}
}

class Test extends Main {
	static final void showPrivate() {
		// System.out.println(new Main().in);
	}
}

class Test2 extends Test {

}

class A {
	A() {
		// System.out.println("construct A");
	}

	void callme() {
		System.out.println("A");
	}
}

class B extends A {
	B() {
		// System.out.println("construct B");
	}

	@Override
	void callme() {
		System.out.println("В");
	}
}

class C extends B {
	C() {
		// System.out.println("construct C");
	}

	void callme() {
		System.out.println("С");
	}
}

public class Main {
	public static final Integer someval = 7;
	static Integer someval2;
	private int in = 666;

	public static void main(String[] args) {
		// Hello.doIt();
		// for( ; ; ) Rand.run();
//		System.out.println("");
		// DetectPrime.doIt();
		// BinaryTest.run();
		// Swich.run();
		// Swich.fib(10);
		// StringNull s = new StringNull();
		// Constructor c = new Constructor("sdf");
		// Dog d = new Dog("Bobby", 2);
		// d.bark('s');
		// d.bark(0.0);
		// d.bark(1234f);
		// d.bark(2);
		// d.bark(0L);
		// d.bark(3);
		// d.bark("sdfsdf", 2);
		// d.bark(2, "");
		// d.gav();
		// System.out.println(d.hashCode());
		// new Dog();
		// System.gc();
		// Array a1 = new Array("s1");
		// Array a2 = new Array("s2");
		// Array a3 = new Array("s3");
		// Array a[] = new Array[3];
		//
		// a[0] = a1;
		// a[1] = a2;
		// a[2] = a3;
		// debug();
//		System.out.println(ConectionManager.getConnections(1));
//		ConectionManager.test();
//		System.out.println("asdfsdfsdfsdf");
//		ConectionManager.test();
//		Main m = new Main();
//		Main.someval2 = someval;
//		Main.someval2 = 8;
//		System.out.println(m.someval2);
//		new Main().in = 777;
//		new C().callme();
//		System.out.println();
//		A a = new A();
//		a.callme();
//		a = new B();
//		a.callme();
//		B b = new B();
//		// a = new C ();
//		// a.callme();
//		b.callme();
//		Parent p = new Parent();
//		p = new Child();
//		p.methodToOverride();
//		p.methodToHide();
//		int[] myint[];
//		System.out.println("___________________");
		int i = 0;
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);

	}
}
