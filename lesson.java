import java.util.Scanner;
import java.util.Arrays;

public class lesson{
	public static void main(String [] args) {
		// char ch1 = 'a';
		// char ch2 = 65;
		// char ch3;
		// ch3 = (char)(ch1 + ch2);
		// System.out.println(ch1);
		// System.out.println(ch2);
		// System.out.println(ch3);
		
		// String s = "japan";
		// System.out.println(s.length());
		// System.out.println(s.charAt(0));
		// for (int i =0; i < 100; i++) {
			// char c = (char)i;
			// System.out.println((char)c+" ");
		// }
		
		// String pwd = "password";
		// Scanner sc = new Scanner(System.in);
		// String entered_pwd = sc.next();
			// if (pwd.equals(entered_pwd)) {
				// System.out.println("true password");
			// } else {
				// System.out.println("Kto nahuy");
			// }
		
		// String s = "ITIS ZAEBIS'";
		// System.out.println(s.substring(0,4));
		// System.out.println(s.indexOf('I'));
		// System.out.println(s.lastIndexOf('S'));
		// if (s.startsWith("ITIS")) {
			// System.out.println("ok");
		// }
		// s.tollpperCase();
		
		// String s = "1234";
		// int num = Integer.parseInt(s);
		// System.out.println(num);
		
		// int k = 123;
		// System.out.println(String.valueOf(k));
		// System.out.println(Integer.toString(k));
		// String.format.("%4d", k);
		
		// String s = "absdefg";
		// int n;
		// n = s.length() -1;
		// for (int i = n; i > 0; i--); {
			
			// System.out.print((char)s.charAt((int)i));
		// }
		
		int [] marks1;
		int marks2[];
		
		marks1 = new int[5];
		
		int[] numbers = {1,2,3,4,5};
		
		for (int i : marks1) {
			System.out.println(i);
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(numbers));
	}
}