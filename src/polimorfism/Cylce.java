package polimorfism;


//Bicycle and Tricycle
public class Cylce {
	public static void raid(Cylce type){
		System.out.println("Cycle.ride()_ "+ type);
	}
	public Object wheels(int i){
		switch (i){
		case 0: return Wheels.values();
		default: return Wheels.values();
		}
		
	}
	public static void main(String ...args){
		System.out.println("lets run Cilce:");
		Bicycle byc =  new Bicycle();
		System.out.println(" "+byc.wheels(0));
		
		Bicycle.run(Wheels.LITE);
		raid(byc) ;
//		
		
//		Tricycle.run("two");
//		Unicycle.run("three");
	}

}
