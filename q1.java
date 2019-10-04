import java.util.Scanner;


public class q1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int n;
		System.out.println("");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (i%2 == 1) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				if (j == n-1) {
					System.out.println("# ");
				} else {			
					System.out.print("# ");
				}
			}
		}
	}
}