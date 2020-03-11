/**
 * String and char operations, Arrays
 * @author Shamil K
 * 
 *
*/

import java.util.Scanner;
import java.util.Arrays;

class Lesson_5 {

	public static void main(String [] args) {
		// // Тип char и операции с ним
		// char ch1 = 'A';
		// // char ch2 = 0;
		// // char ch3;
		
		// // ch3 = (char)(ch1 + ch2 + 1);
		
		// // System.out.println(ch1);
		// // System.out.println(ch2);
		// // System.out.println(ch3);
		// for (int i =0; i < 65535; i++) {
			// char c = i;
			// System.out.print(c);
			// System.out.print(" ");
		// }
		
		// System.out.println((int) ch1);
		
		
		// // Строки и операции с ними
		// char c = '"';
		// String str = "Некая строка.";
		// System.out.println(str.length());
		// System.out.println(str.charAt(1));
		// for (int i = 0; i < str.length(); i++) {
			// System.out.println(str.charAt(i));
		// }
		
		// String pwd = "password";
		// Scanner sc = new Scanner(System.in);
		// String entered_pwd = sc.next();
		
		// if (pwd.equals(entered_pwd)) {
			// System.out.println("True password.");
		// } else {
			// System.out.println("False password.");
		// }
		
		// String str = "Java is cool!";
		// System.out.println(str.substring(0, 3)); // подстрока из строки
		// System.out.println(str.indexOf("is")); 
		// System.out.println(str.lastIndexOf('a')); 
		// if (str.toLowerCase().startsWith("Java")) {
		// System.out.println("ok");
			
		// }
		
		// str.toUpperCase()
		
		// // Перевод строки к примитивным типам
		// String str = "1234";
		// int num = Integer.parseInt(str);
		// // Byte.parseByte()
		// // Double.parseDouble()
		// //	Boolean.parseBoolean("true") 
		
		
		//// перевод от типов к строке
		
		// // System.out.println(num);
		// int k = 123;
		// System.out.println(String.valueOf(k));
		// Integer.toString(k);
		
		// String.format("%4d", k);
		
		// String str = "abcdefg";
		// String result = "";
		// for (int pos = str.length() - 1; pos >= 0; pos--) {
			// result += str.charAt(pos);
		// }
		// System.out.println(result);
		
		// // Пример шифрования Цезаря
		// // n = 3
		// // ABCDEF
		// // DEFABC
		
		
		// Массивы и базовые операции
		int[] marks1;
		int marks2[];
		
		marks1 = new int[5];
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		for (int i : marks1) {
			
			System.out.println(i);
		}
		
		numbers[0] = 123;
		numbers[1] = 321;
		
		for (int i = 0; i < numbers.length; i++) {
			marks1[i] = numbers[i];
			System.out.printf("%d = %d%n", numbers[i], marks1[i]);
		}
		
		System.out.println(Arrays.toString(marks1));
		
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print((i == 0 ? "[" : "") + numbers[i] + (i < numbers.length - 1 ? ", " : "]"));
		}
	}

}