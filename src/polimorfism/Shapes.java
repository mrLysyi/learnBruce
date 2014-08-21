package polimorfism;

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main (String... args){
		Shape[] shape = new Shape[15];
		for(int i=0; i < shape.length; i++){
			shape[i] = gen.next();
		}
			
			for (Shape shp : shape){
				shp.printMsg();
				shp.erase();
			}
		}
		
	}


