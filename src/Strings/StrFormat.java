package Strings;

import java.util.Formatter;

public class StrFormat {
	 int i = 2;
	private double d = 2.2;
	private float f = 2;
	private long ln = 2;

	@Override
	public String toString() {
		Formatter f = new Formatter(System.out);
		String rez="";
		String pfff="ss";
//		return "StrFormat [i=" + i + ", d=" + d + ", f=" + f + ", ln=" + ln
//				+ "]";
//		rez = "i";
		f.format(" i: %s\n d: %s\n", i, d );
		System.out.println("rez: " + rez + ", pfff: " + pfff);
		return rez;
	}

	public static void main(String[] args) {
		StrFormat sf = new StrFormat();
		System.out.println(sf.toString());
	}
}
