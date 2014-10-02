package Interfaces;

interface RMain {
	public void doMain();
}

interface ROne extends RMain {
	public void doOne();
}

interface RTwo extends RMain {
	public void doTwo();
}

interface RThird extends RTwo, ROne {
	public void doThird();
}

public class Romb implements RThird{

	@Override
	public void doTwo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doMain() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doThird() {
		// TODO Auto-generated method stub
		
	}

}
