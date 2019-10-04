import java.util.Scanner;

public class Sum_drobey{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the digit");
		n = sc.nextInt();
		double sum = 0;
		if (n % 2 == 0) {
			n--;
		}
		while (n > 0) {
			sum += (double)1 / n;
			n -= 2;
		}
		System.out.println(sum);
	}
}
		