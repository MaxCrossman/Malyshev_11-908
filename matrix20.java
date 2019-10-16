public class matrix20 {
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
		int x = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				x *= mx[j][i];
			}
			System.out.print(x+"  ");
			x = 1;
		}
	}
}