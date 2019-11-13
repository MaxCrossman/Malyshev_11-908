import java.util.Scanner;

public class matrix17 {
	public static void main(String [] args) {
		int m = 5;
		int n = m;
		int [][] mx = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mx[i][j] = (int)(Math.random()*100);
				System.out.print("["+mx[i][j]+"]");
			}
			System.out.println("");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings number");
		int k = (sc.nextInt())-1;
		int sum = 0;
		int x = 1;
		for (int i = 0; i < n; i++) {
			sum += mx[k][i];
			x *= mx[k][i];
		}
		System.out.println(sum+"  "+x);
	}
}
		