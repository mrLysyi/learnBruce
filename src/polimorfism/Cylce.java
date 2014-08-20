package polimorfism;


//Bicycle and Tricycle
public class Cylce {
	public static void raid(Bicycle type){
		System.out.println("Cycle.ride()_ "+ type);
	}
	public static void main(String ...args){
		System.out.println("lets run Cilce:");
		Bicycle byc = new Bicycle();
		Bicycle.run("one");
		raid(byc) ;
		
		Tricycle.run("two");
		Unicycle.run("three");
	}

}
