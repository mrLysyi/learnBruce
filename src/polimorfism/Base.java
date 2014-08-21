package polimorfism;

class BaseInh extends Base{
	@Override
	void baseTwo(){
		Base b = new Base();
		b.baseOne();
	}
	
}

public class Base {
	void baseOne(){System.out.println("baseOne");}
	void baseTwo(){
		Base b = new Base();
		b.baseOne();
	}
	public static void main(String[] args) {
		Base bb = new Base();
		bb.baseOne();
		bb.baseTwo();
		System.out.println("Second inh class");
		Base bbb = new BaseInh();
		bbb.baseOne();
		bbb.baseTwo();
	}

}
