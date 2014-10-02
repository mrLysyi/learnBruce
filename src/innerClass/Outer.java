package innerClass;

public class Outer {
	private final String str = "some str";

	Outer() {
		System.out.println("Outer constructord");
	}

	public Inner getInner() {
		return new Inner();
	}

	public class Inner {
		@Override
		public String toString() {
			System.out.println("ToString_inner: " + str);
			return str;

		}

		Inner() {
			System.out.println("Inner constructor");
		}
	}

	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.getInner();
		// Object obj[] = new Object[2];
		Outer seq[] = new Outer[2];
		seq[0] = new Outer();
		// for(Outer s:seq){
		// System.out.println(s.toString());
		// }
		Outer.Inner inner = ou.getInner();
		System.out.println(inner.toString());
//		seq[0].toString();
	}
}
