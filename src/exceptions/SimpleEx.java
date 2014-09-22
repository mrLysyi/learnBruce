package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class SimpleException2 extends Exception {
	static private String str;
	private static Logger logger = Logger.getLogger("SimpleException2");
	SimpleException2(String str){
		super(str);
		System.out.println("Ex constructor = " + str);		
	this.str=str;
	}
	public static String getStr() {
		return str;
	}
	static void logEx(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
}

public class SimpleEx {
	public static void main(String[] args) {
		try {
			throw new SimpleException2 ("test one");
			
		} catch (Exception e) {
//			System.out.println("catch e= " + e);
			e.printStackTrace(System.out);
//			e.;
			// TODO: handle exception
			
		}
		finally {
			System.out.println("finally");
		}
		String str = null;
		try{
			System.out.println(str.hashCode());
		} catch(Exception e ){
			System.out.println("str - exception");
			SimpleException2.logEx(e);
		}
		System.out.println(SimpleException2.getStr());
		
	}
}
