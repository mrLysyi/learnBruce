package Oracle;

class Parent { 
    public Parent(String s){ 
        print("created"); 
    } 
    public static void print(String s){ 
        System.out.println("Parent: " + s); 
    } 
} 
 
public class Child extends Parent { 
    public Child(String s) { 
		super(s);
		// TODO Auto-generated constructor stub
	}

	public static void print(String s){ 
        System.out.println("Child: " + s); 
    } 
    
//   super(){}
    
    public static void main(String[] args){ 
        Parent child = new Parent("vhj"); 
        print("created"); 
    } 
}