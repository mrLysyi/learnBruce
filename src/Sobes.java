import java.util.Arrays;
import java.util.Collections;
import net.mindview.util.*;

import net.mindview.util.Generated;
class One {
	
	One(){
		 {System.out.println("one Static");}
		 
	}
}
class Two extends One {
	Two(){
		 {System.out.println("two Static");}	
	}
	
	
}
public class Sobes  {
	public static void main(String[] args) {
		Integer[] integers = {0, 2, 3, 104, 5} ;
//		CompType[] a = Generated.array(
//				new CompType[12], CompType.generator());
//		integers = {0, 1, 2, 3, 4};
		System.out.println(Arrays.toString(integers));
//		int[] rev = Arrays.sort(integers);
		Arrays.sort(integers, Collections.reverseOrder());
		System.out.println(Arrays.toString(integers));
		new Two();
//		integers
	}
}
