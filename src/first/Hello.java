package first;

//@version version-information
//@author Andrii

import java.util.Date.*;
//import java.util.Date.*;

public class Hello {
	private static int test = 1;
		
	public static int getTest() {
		return test;
	}

	public static void setTest(int test) {
		Hello.test = test;
	}

	public static void doIt() {
//		System.out.println("Hello Linux!");
//		System.out.println(new Date());
//		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.dir"));
		System.out.println(
		System.getProperty("java.library.path"));	
		
		Hello h = new Hello();
		h.setTest(2);
		Hello hh = new Hello();
		h.setTest(3);
		System.out.println("h= "+h.test+" hh= "+hh.test);
	}

}

