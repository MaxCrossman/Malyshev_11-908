public class sort {
	public static void sortEvenOdd(int [] a) {
		int u = a.length;
		int w = 0;
		int u1 = u/2;
		int [] b = new int[u];
		for (int i = 0; i < u; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < u; i++) {
			if (b[i]%2 != 0) {
				a[w] = b[i];
				w++;
			}
		}
		for (int i = 0; i < u; i++) {
			if (b[i]%2 ==0) {
				a[w] = b[i];
				w++;
			}
		}
	}
	
	public static void main(String [] args) {
		int n = 10;
		int [] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.print("["+a[i]+"] ");
		}
		System.out.println("");
		System.out.println("");
		sortEvenOdd(a);
		for (int i = 0; i < n; i++) {
			System.out.print("["+a[i]+"] ");
		}
	}
}