/**
* Input/Output, Loops
* @author Shamil K
* 
*
*/

import java.util.Scanner;

class Lesson_4 {
	public static void main(String [] args){
		if (args.length > 0) System.out.println(args[0]);
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Введите значение: ");
		
		n = sc.nextInt();
		
		// квадрат n*n
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print((j % 2 == 0) ? "# " : "* ");
			}
			System.out.println();
		}
		
		// System.out.println(sum);
		
		// double d;
		// n = sc.nextInt();
		// d = sc.nextDouble();
		// String str = sc.next();
		
		// %(a)d - digit, %4d 1: '   1'; 123: ' 123'
		// %(a)s - string, 
		// %(a.b)f - double, 
		// %n - newline
		// System.out.println("Вы ввели: " + n);
		// System.out.printf("Вы ввели: int = '%4d', double = '%6.2f'", n, d);
		// System.out.println();
		// System.out.printf("%1.5f", Math.PI);
		
	}
}