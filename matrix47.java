import java.util.Scanner;

public class matrix47 {
	public static void main(String [] args) {
		int m = 3;
		int n = m;
		int k = 10;
		int [][] mx = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mx[i][j] = (int)(Math.random()*k);
				System.out.print("["+mx[i][j]+"]");
			}
			System.out.println("");
		}
		Scanner sc = new Scanner(System.in);
		int k1 = sc.nextInt() - 1;
		int k2 = sc.nextInt() - 1;
		for (int i = 0; i < n; i++) {
			mx[k1][i] += mx[k2][i];
			mx[k2][i] = mx[k1][i]-mx[k2][i];
			mx[k1][i] -= mx[k2][i];
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("["+mx[i][j]+"]");
			}
			System.out.println("");
		}
	}
}