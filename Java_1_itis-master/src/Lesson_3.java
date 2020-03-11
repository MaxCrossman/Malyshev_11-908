/**
* Basic syntaxes, Basic operations
* @author Shamil K
* 
*
*/

public class Lesson_3 {

	public static void main(String [] args) {
		int sumOdd = 0;
		int sumEven = 0;
		int lowerbound = 1, upperbound = 1000;
		int absDiff;
		int number = lowerbound;
		
		// while (number <= upperbound) {
			// if (number % 2 == 1) {
				// sumOdd += number; 
			// } else {
				// sumEven += number; 
			// }
			// number++; 
		// }
		
		do {
			if (number % 2 == 1) {
				sumOdd += number; 
			} else {
				sumEven += number; 
			}
			number++; 
		} while (number <= upperbound);
		
		// for (int number = 0; number < upperbound; number++) {
			
		// }
		// foreach
		
		// int a [10];
		// for (int i : a) {
			
		// }

		absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;
		System.out.println("Сумма нечетных = " + sumOdd);
		System.out.println("Сумма четных = " + sumEven);
		System.out.println("Абсолютная разница = " + absDiff);
		
		// int a = 1 ;	
		// ++a;
		// a++;
		// System.out.println(a++);
		// System.out.println(++a);
		// System.out.println(a);
		// final double PI = 3.14;
		// int k = Integer.MAX_VALUE;
		// System.out.println((byte)(k + 1));
		
		
		int m = 2;
	
		if (m == 1) System.out.println("Январь");
		if (m == 2) System.out.println("февраль");
		if (m == 3) System.out.println("март");
		if (m == 4) System.out.println("апрель");
		
		switch (m) {
			case 1:
				System.out.println("Январь");
				break;
			case 2:
				System.out.println("Февраль");
				break;
			case 3:
				System.out.println("Март");
				break;
			default:
				System.out.println("неправильный формат месяца.");
				
		}
	
	}



}