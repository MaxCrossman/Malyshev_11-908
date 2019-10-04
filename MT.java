import java.util.Scanner;

public class MT {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("    ");
		for (int i = 1 ; i <= n; i++) {
			System.out.printf("%4d",i);
		}
		System.out.println(" ");
		for (int i = 1; i <= ((4*n)+5); i++) {
			System.out.print("_");
		}
		System.out.println(" ");
		for (int i = 1; i <= n; i++) {
			System.out.printf("%4d", i);
			System.out.print("|");
			
			for (int j = 1; j <=n; j++) {
				System.out.printf("%4d", (int)(i*j));
			}
			System.out.println(" ");
		}
	}
}