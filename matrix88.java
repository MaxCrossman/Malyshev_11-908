public class matrix88 {
	public static void main(String [] args) {
		int m = 5;
		int u = 10;
		int [][] mx = new int[m][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				mx[i][j] = (int)(Math.random()*u);
				System.out.print("["+mx[i][j]+"]");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < m-1; i++) {
			for (int j = i+1; j < m; j++) {
				mx[j][i] = 0;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("["+mx[i][j]+"]");
			}
			System.out.println("");
		}
	}
}
				