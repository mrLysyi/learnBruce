package HoldingObjects;

import java.util.*;

public class Gerbil {
	private int gerbilNumber = 1;
	Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;		
	}
	public void hop(){
		System.out.println(gerbilNumber);
	}
	public static void main(String[] args) {
		ArrayList birds =new ArrayList();
		for (int i=0; i<5; i++){
			birds.add(new Gerbil(i));
		}
		for (int i=birds.size()-1; i>=0; i--){
			((Gerbil) birds.get(i)).hop();	
		}
		List<Gerbil> ge = new ArrayList<Gerbil>(8); 
		Iterator<Gerbil> it = ge.iterator();
		for (int i=0; i<5; i++){
			ge.add(new Gerbil(i));
		}
		while(it.hasNext()){
//			System.out.println(ge.iterator());	
			Gerbil ge1 = it.next();
			System.out.print( ":" + ge1 + " ");
		}
		for (Gerbil g : ge){
			System.out.println("ge");
		}
		Map<Integer, Integer> im = new HashMap<Integer, Integer>()	; 
	}
}
