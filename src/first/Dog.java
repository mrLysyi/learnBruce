package first;

public class Dog {
	private boolean chekOut = false;
	String name;
	public Dog(){chekOut = true;}
	public Dog(String name){
		this.name=name;
		chekOut = true;
	}
	public Dog(String name, int age){ //constructor calls another constructor
		this(name);
		chekOut = true;
		System.out.println("name, age = "+ name +" " +age + " years");
	}
	
	public void bark(char ch){System.out.println("char "+ch);}
	public void bark(short sh){System.out.println("short "+sh);}
	public void bark(int in){System.out.println("int "+in);}
	public void bark(long ln){System.out.println("long "+ln);}
	public void bark(double db){System.out.println("double "+db);}
	public void bark(float ft){System.out.println("float "+ft);}
	public void bark(String st){System.out.println("float "+st);}
	public void bark(String st , int i){System.out.println("String st "+st+"int"+i);}
	public void bark(int i, String st ){System.out.println("String st "+"int");}
	public void say(){
		System.out.print("say ");
	}
	public void  gav(){
		say();
		System.out.println("Gav");
		
	}
	public void check(){
		
	}
	@Override
	public void finalize(){
		System.out.println("finalize, collecting garbage");
		
	}
	

}
