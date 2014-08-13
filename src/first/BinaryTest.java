package first;

public class BinaryTest {
	final static Integer one = 0b1011; //11
	final static Integer two = 0b1100; //12
	public static void run(){
//		one = one+1;
		System.out.print(" binary rep= " + Integer.toBinaryString(one)+
				" , decimical= " + one);
		System.out.println();
		System.out.print(" binary rep= " + Integer.toBinaryString(two)+
				" , decimical= " + two);
		System.out.println();
		
		System.out.println(" '011' operator '100' = " 
		+Integer.toBinaryString(one | two) +" "+ (one | two));
		
	}
}
