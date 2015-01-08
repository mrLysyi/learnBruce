package Oracle;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HelloWorld {
	public static long factorial (int n){
		if (n == 1)
			return 1;
		return (n*(factorial(n-1)));
		
	}
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer,Integer> m =new HashMap<Integer,Integer>();
		for(int i = 0; i < 10000; i++) {
		// Produce a number between 0 and 20:
		int r = rand.nextInt(20);
		Integer freq = m.get(r);
		m.put(r, freq == null ? 1 : freq + 1);
		}
		System.out.println(m);
		System.out.println(HelloWorld.factorial(15));
	}
	

}
