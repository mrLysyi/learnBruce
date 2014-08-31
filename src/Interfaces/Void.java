package Interfaces;
import first.SomeInterface;



abstract class Abs{
//	Abs (){ print();	}
//	abstract void print();	
	static void take() {}
}

class Abss extends Abs{
	private int i=1;
	public  void print(){
		System.out.println("Abss extends abstract Abs, i = "+i);
	}
	static  void take(Abs a){
		System.out.println("kokoko "+a);
		
	}	
}
class SomePrint implements SomeInterface{	
	public void somePrint() {
		System.out.println("asd");	
	}
	public int printInt(int i) {
		System.out.println("int= "+ i + "intNext= " + VALUE);
		return 0;
	}
	
}
public class Void {
public static void main(String[] args){
//	Abss a = new Abss();
////	a.print();
//	a.take(a);
	SomePrint s = new SomePrint();
	s.somePrint();
	s.printInt(2);
	
}
}
