package first;

public class Varargs {
	
	String args[];
	String [] str;
//	args[1]="s";
	Varargs(String... ss){
//		System.out.println("inside constructor " + ss);
		for(String st : ss){
			System.out.println("inside construct " + st);
		}
	
	}
	
	public void s(int i, String... stt){
		str = stt;
		for(String s : stt){
			System.out.println("inside method " + s);
		}
		
	}
	public enum Spiciness{
		NOT,MILD, MEDIUM, HOT, FLAMING
	}
	

public static void main (String... args){
	
	Varargs v  = new  Varargs("one", "two"); 
	v.s(1,"s");
	System.out.println("---------");
	if  (args.length == 0){
		System.out.println("args==0");
	}
	for (String s : args ){
		System.out.println(s);
	}
	System.out.println("---------");
	System.out.println(Spiciness.NOT+" "+ Spiciness.NOT.ordinal());
	for(Spiciness s : Spiciness.values()){
		System.out.println(s + " ,ordinal " +s.ordinal());
	}
	Spiciness sph = Spiciness.NOT;
	switch(sph){
	case NOT: System.out.println("case - NOT");
		break;
	
	
	default: System.out.println("case - default");
		break;
	
	}
}
}
