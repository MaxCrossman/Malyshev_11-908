import java.util.Scanner;

public class Triangle{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit");
		int n;
		n = sc.nextInt();
		int m = n;
		int a = 1, b = 1;
		while (n != 0) {
			while (b != 0) {
				System.out.print("o ");
				b--;
			}
			System.out.println("");
			a++;
			b = a;
			n--;
		}
		int s = 2 * m;
		int p = 2 * m;
		int c = 1;
		int q = 1;
		while (m != 0) {
			while (s != 0) {
				System.out.print(" ");
				s--;
			}
			while (c != 0) {
				System.out.print("o ");
				c--;
			}
			System.out.println(" ");
			s = p - 2;
			p -= 2;
			m--;
			q += 2;
			c = q;
			
		}	
	}
}
				