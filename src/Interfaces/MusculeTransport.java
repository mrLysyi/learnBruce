package Interfaces;

interface Cycle {
	boolean move();
}

interface CycleFactory {
	Cycle getCycle(int weels);
}

// Unicycle, Bicycle
// and Tricycle

class Unicycle implements Cycle {
	private int gear = 0;
	private boolean rezult = false;

	public boolean move() {
		if (gear > 0) {
			boolean rezult = true;
			System.out.println(this.getClass().getName()+ " move");
		}
		return rezult;
	}

}

class Bicycle implements Cycle {
	private int gear = 1;
	private boolean rezult = false;

	public boolean move() {
		if (gear > 0) {
			boolean rezult = true;
			System.out.println(this.getClass().getName()+ " move");
		}
		return rezult;
	}
}

class Tricycle implements Cycle {
	private int gear = 1;
	private boolean rezult = false;

	public boolean move() {
		if (gear > 0) {
			boolean rezult = true;
			System.out.println(this.getClass().getName()+ " move");
		}
		return rezult;
	}
}

class implCycleFactory implements CycleFactory {
	public Cycle getCycle(int weels) {
		Cycle rezult = null;
		switch (weels) {
		case 0:
			rezult = new Unicycle();
			break;
		case 1:
			rezult = new Bicycle();
			break;
		case 2:
			rezult = new Tricycle();
			break;
		}
		// TODO Auto-generated method stub
		return rezult;
	}

}

public class MusculeTransport {
	public static void cycleConsumer(CycleFactory fact){
		Cycle c = fact.getCycle(2);
		c.move();
	}
	public static void main(String[] args) {
		cycleConsumer(new  implCycleFactory() );
		

	}

}
