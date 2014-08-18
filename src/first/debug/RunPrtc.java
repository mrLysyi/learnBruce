package first.debug;

public class RunPrtc {
	private static int i=11110;
	protected static void show(){
		System.out.println(i);
	}
	public static void main(String [] args){
		DebugOne.debug();
//		System.out.println(i);
//		show();
	}

}
