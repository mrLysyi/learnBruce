package first;

//: control/WhileTest.java
//Demonstrates the while loop.
public class WhileTest {
static boolean condition() {
boolean result = Math.random() < 0.99;
System.out.print(result + ", ");
return result;
}
public static void run() {
	int i=0;
while(condition()){
System.out.println("Inside ‘while’ " +i);
i+=1;
}
System.out.println("Exited ‘while’");

}
} /* (Execute to see output) *///:~