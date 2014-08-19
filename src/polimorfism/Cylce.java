package polimorfism;


//Bicycle and Tricycle
public class Cylce {
	public void raid(String type){
		System.out.println("Cycle.ride() "+ type);
	}
	public static void main(String ...args){
		System.out.println("lets run Cilce:");
		Bicycle.run("one");
		Tricycle.run("two");
		Unicycle.run("three");
	}

}
