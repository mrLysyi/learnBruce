package first;

public  class ConectionManager {
private static String[] connections = {"one", "two", "three"};
private static boolean[] what = {true,true,true};

private ConectionManager(){
	
}

public static String getConnections(int i) {
	String rezult = null;
	
	if (i < connections.length && what[i]==true     ){
		what[i] = false;
		rezult = connections[i];
	}
	return rezult;
}

private static void setConnections(int i, String connect) {
	ConectionManager.connections[i] = connect;
}
public static void test (){
	System.out.println(getConnections(0));
	System.out.println(getConnections(1));
	System.out.println(getConnections(2));
	System.out.println(getConnections(1));
}
}
