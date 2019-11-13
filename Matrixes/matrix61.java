import java.util.Scanner;

public class matrix61 {
	public static void main(String [] args) {
		int m = 7;
		int n = 3;
		int u = 2;
		int [][] mx = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mx[i][j] = (int)(Math.random()*u);
				System.out.print("["+mx[i][j]+"]");
			}
			System.out.println("");
		}
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt() - 1;
		int [][] im = new int [m-1][n];
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {
				im[i][j] = mx[i][j];
				System.out.print("["+im[i][j]+"] ");
			}
			System.out.println("");
		}
		for (int i = k; i < (m-1); i++) {
			for (int j = 0; j < n; j++) {
				im[i][j] = mx [i+1][j];
				System.out.print("["+im[i][j]+"] ");
			}
			System.out.println("");
		}
	}
}