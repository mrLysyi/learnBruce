package polimorfism;

public class Circle extends Shape{
	@Override
	public void draw(){System.out.println("Circle.draw()");}
	@Override
	public void erase(){System.out.println("Circle.erase()");}
	@Override
	public void printMsg(){System.out.println("Circle massage1111");}
}
