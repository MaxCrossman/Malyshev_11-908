public class matrix27 {
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
		int min = 100;
		int max = -1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mx[i][j]<min) {
					min = mx[i][j];
				}
			}
			if (min > max) {
				max = min;
			}
			min = 100;
		}
		System.out.println(max);
	}
}