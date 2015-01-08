package concurrency;

import java.util.Date;
import java.util.GregorianCalendar;

public class go {
	go() {
	 {
			System.out.println("Hello");
		}
	}
	static void h(){
		System.out.println("h");
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new go();
//			go.h();
		}
		// System.out.println("go");
		// // Date d = new Date();
		//
		// GregorianCalendar gk = new GregorianCalendar();
		// long time_begin = gk.getTimeInMillis();
		// for (int i = 0; i < 1000; i++) {
		// Thread g = new Thread(new CatSay());
		// g.start();
		// }
		// GregorianCalendar gk2 = new GregorianCalendar();
		// // Date d_d = new Date();
		// long time_end = gk2.getTimeInMillis();
		// System.out.println("---------------------------time: " + (time_end -
		// time_begin));
	}
}
