import first.BinaryTest;
import first.Constructor;
import first.DetectPrime;
import first.Dog;
import first.Hello;
import first.Rand;
import first.StringNull;
import first.Swich;

public class main {
	
	public static void main(String[] args){
//		Hello.doIt();
//		for( ; ; ) Rand.run();	
			System.out.println("");
//			DetectPrime.doIt();
//			BinaryTest.run();
//			Swich.run();
//			Swich.fib(10);
//			StringNull s = new StringNull();
//			Constructor c = new Constructor("sdf");
			Dog d = new Dog("Bobby", 2);
			d.bark('s');
			d.bark(0.0);
			d.bark(1234f);
			d.bark(2);
			d.bark(0L);
			d.bark(3);
			d.bark("sdfsdf", 2);
			d.bark(2, "");
			d.gav();			
			System.out.println(d.hashCode());
			new Dog();
			System.gc();
		}
}
