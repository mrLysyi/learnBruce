package Strings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PatternMacher<E> {
	public Set<String> ptr;
	Integer i[];
//	ArrayList paternsList = new ArrayList<String>(add("asd"));
	
	PatternMacher matcher = new PatternMacher();
	public static void main(String[] args) {
		String str = "Java now has regular expressions";
		Pattern p = Pattern.compile("J+");
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
//		ii= new ArraList<Integer>;
//		ptr.add("s");
//		ptr = new TreeSet<String>();
	}

}
