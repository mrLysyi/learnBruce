package Strings;

import java.util.regex.*;

import net.mindview.util.TextFile;
public class SimplePattern {
	static String tstr = "Java now has regular expressions";
	static String tstrTwo = "Arline ate eight apples and one orange while Anita hadn’t any";
	static String patstr[] = {"^Java","\\Breg.*","n.w\\s+h(a|i)s","S{1}.","s{0,3}",
		"(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b"};
	static Pattern p = Pattern.compile(patstr[5]);
	static Matcher m = p.matcher(tstrTwo);
	public static void main(String[] args) {
		String s = TextFile.read("TheReplacements.java");
		if(m.find())
		System.out.println("find  "+" word "+m.group()+" start "+m.regionStart()+
				" end "+m.regionEnd());
		else System.out.println("false");
	}

}
