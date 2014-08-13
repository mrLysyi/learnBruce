package first;

import java.util.Random;

public class Swich {
public static void run(){
	Random rand = new Random();
	int i = rand.nextInt(5);
	switch(i){
	case 1 : System.out.println(i); break;
	case 2 : System.out.println(i); break;
	case 3 : System.out.println(i); 
	case 4 : System.out.println(i); break;
	case 5 : System.out.println(i); break;
	default: System.out.println(i);
	}
	}
	public static void fib(int count){
		
		int before = 0;
		int curr = 1;
		int next = 0;
		for(int i = 0; i<count; i++){
			next = curr;
			curr=curr+before;			
			System.out.print(","+curr);
			before = next;
		}
	
}
}
