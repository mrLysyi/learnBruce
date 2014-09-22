package exceptions;

class VeryImportantException extends Exception {
	public String toString() {

		return "A very important exception!";
	}
}

class SecondLevelException extends Exception {
	public String toString() {

		return "Second level Exception";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

public class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void ff() throws SecondLevelException {
		throw new SecondLevelException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	public static void main(String[] args) {
		LostMessage lm = new LostMessage();
		try {
			
			
			lm.f();
			lm.dispose();
			return;
		}

		catch (Exception e) {
//			lm.ff();
			System.out.println(e);
			return;
		} finally {
			System.out.println("finaly");
			// return;
		}

	}
}
