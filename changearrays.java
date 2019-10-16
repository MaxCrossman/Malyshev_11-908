public class changearrays {
	public static void changeArrayValues(int [] a, int [] b) {
		int w = a.length - 1;
		for (int i = 0; i <= w; i++) {
			a[i] -= b[i];
			b[i] += a[i];
			a[i] =  (a[i]-b[i])*(-1);
		}
	}
	public static void main(String [] args) {
		int n = 5;
		int [] mas1 = new int[n];
		int [] mas2 = new int[n];
		for (int i = 0; i < n; i++) {
			mas1[i] = (int)(Math.random()*100);
			mas2[i] = (int)(Math.random()*100);
		}
		System.out.println("Before:");
		for (int i = 0; i < n; i++) {
			System.out.println("["+mas1[i]+"] | ["+mas2[i]+"]");
		}
		changeArrayValues(mas1 , mas2);
		System.out.println("After:");
		for (int i = 0; i < n; i++) {
			System.out.println("["+mas1[i]+"] | ["+mas2[i]+"]");
		}
	}
}
		