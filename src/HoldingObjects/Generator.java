package HoldingObjects;

import java.util.*;

public class Generator {
//	private  Random rand = new Random(47);

	String typeGen() {
		String rezult;
		Random rand = new Random();
		switch (rand.nextInt(3)) {
		case 0:
			rezult = "humen";
			break;
		case 1:
			rezult = "robot";
			break;
		case 2:
			rezult = "enimal";
			break;
		default:
			rezult = "unnoun";
			break;
		}
		return rezult;

	}

	 String nameGen() {
		String rezult;
		Random rand = new Random();
		switch (rand.nextInt(4)) {
		case 0:
			rezult = "Olly";
			break;
		case 1:
			rezult = "Koko";
			break;
		case 2:
			rezult = "Boby";
			break;
		default:
			rezult = "Dzinch";
			break;
		}
		return rezult;

	}

	static Collection fill(Collection<String> collection) {
		for (int i=0; i<10; i++){
			Generator g = new Generator();
			collection.add(g.nameGen());
		}
		return collection;
	}

	static Map fill(Map<String, String> map) {
		for (int i=0; i<10; i++){
			Generator g = new Generator();
			map.put(g.typeGen(), g.nameGen());
		}
		return map;
	}
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new HashMap<String,String>()));
		System.out.println(fill(new TreeMap<String,String>()));
		System.out.println(fill(new LinkedHashMap<String,String>()));
	}
}
