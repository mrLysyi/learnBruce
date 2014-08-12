package first;

public class DetectPrime {
	
	public static String doIt(){
		String strRez = "";
		for (int i = 1; i < 1000; i++){
			 
			 int rez =1;
			 int count=0;
			 int iterator = i;
			
				for (int de = 1; de <= iterator; de++ ){
					rez = iterator % de ;
					if (rez==0)  count++;
					
					}
				if (count == 2) {
					System.out.print(iterator+" ");
					strRez = iterator+" ";
				
				}
			
		}
		return strRez;
	}

}
