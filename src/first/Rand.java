package first;

public class Rand {
	public static byte comparsion(Double first, Double second){
		byte rez = 1;
		if (first.equals(second)){
			rez = 0;
		}
		else if (first > second){
			rez = 1;			
		}
		else rez = -1;		
		return rez;
	}
	public  static void run(){
		Double rSecond = 0.0;
		for (int i=0; i<25; i++){
			Double rFirst = Math.random();
			
			System.out.print(rFirst);
			System.out.println(" comparasion " +comparsion(rFirst , rSecond ));
//			if(comparsion(rFirst , rSecond )==0) {
//				System.out.println("ZERO");
//				break;
//			}
			rSecond = rFirst;
		}
	}

}
