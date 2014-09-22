import java.util.ArrayList;

public class ReversArr {
	private static int someArr[] = { 1, 2, 3, 4, 5 };

	static int[] revers(int[] current) {
		int count = 0;
		int[] revArr = new int[current.length];
		for (int i = current.length - 1; i >= 0; i--) {
			revArr[count] = current[i];
			count++;
		}
		return revArr;
	}

	public static void main(String[] args) {
		for (int s : someArr) {
			System.out.print(s + " ");
		}
		System.out.println("");
		someArr = revers(someArr);
		for (int s : someArr) {
			System.out.print(s + " ");
		}
		String str[] = { "one", "two", "three", "four", "five" };
		{
			System.out.println(str[0] + " " + str[1] + " " + str[2] + " "
					+ str[3] + " " + str[4]+" " );
		}
		int count = 0;
		String begin, end;

		// String tmp[] = new String[str.length];
		for (int i = (str.length - 1); i >= (str.length )/2; i--) {
			begin = str[count];
			end = str[i];
//			System.out.println("begin " + begin + " end " + end);
			str[count] = end;
			str[i] = begin;
			count++;
		}
		
		System.out.println(str[0] + " " + str[1] + " " + str[2] + " " + str[3]
				+ " " + str[4]+" ");
		Integer a = 120;
		Integer b = 120;
		Integer c = 130;
		Integer d = 130;
		System.out.println(a==b);
		System.out.println(c==d);

	}
}
