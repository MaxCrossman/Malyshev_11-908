public class matrix41 {
	public static void main(String [] args) {
		int m = 5;
		int n = m;
		int k = 5;
		int [][] mx = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					mx[i][j] = (int)(Math.random()*k);
					System.out.print("["+mx[i][j]+"]");
				}
				System.out.println("");
			}
		int c = 0;
		int r;
		int u;
		int x = 0;
		int y = -1;
		for ( int i = 0; i < n; i++) {
			for ( int j = 0; j < m; j++) {
				r = mx[j][i];
				u = j + 1;
				while (u < m) {
					if (r == mx[u][i]) {
						x++;
					}
					u++;
				}
			if (x > y) {
				y = x;
				c = r;
			}
			x = 0;
			}
		}
		if (y == -1) {
			System.out.println("No identical numbers");
			} else {
				System.out.println("d: "+c+" |  n: "+y);
			}
	}
}
		