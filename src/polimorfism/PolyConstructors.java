package polimorfism;

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}
class RectangularGlyph extends Glyph{
	private int side = 10;
	public RectangularGlyph(int s) {
	side = s;
	System.out.println("RectangleGlyph.RoundGlyph(), side = " + side);
	}
	void draw() {
		System.out.println("RectangleGlyph.draw(), side = " + side);
	}
	
}

public class PolyConstructors {
	public static void main(String[] args) {

		new RoundGlyph(5);
		new RectangularGlyph(15);
	}
}
