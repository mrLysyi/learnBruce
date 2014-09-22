package InnerClass;

public class Outer {
	Outer(){
		System.out.println("outer constructor");
	}
	class Inner{
		private String s = "Inner";
		Inner(){
			System.out.println("Inner constructor");
		}
		String getInner(){
			return s;
		}
		
	}
	void getHidInner(){
		Inner in = new Inner();
		System.out.println(in.getInner());
	}
	
	public static void main(String[] args) {
	Outer outer = new Outer();
	outer.getHidInner();
	Outer.Inner inner = outer.new Inner();
	RefInner refin = new RefInner();
	refin.getRef();
	}

}
class RefInner{
	Outer.Inner getRef(){
		System.out.println("RefIn---------------");
		Outer outer = new Outer();
		return (outer.new Inner());
	}
}
