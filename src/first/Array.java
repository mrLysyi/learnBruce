package first;

import java.util.Random;

public class Array {
	public Array(String str){
		System.out.println("Constructor run= "+str);
	}
	static void go(){
	Random rand = new Random(47);
	Integer a[] = new Integer[20];
	for(int i=0; i<a.length;i++){
		a[i] = rand.nextInt(666);
		System.out.print(a[i]+" ");
	}
	System.out.println(a.toString());
	for(int i : a){
		System.out.println(i);
		
	}
	}

}
