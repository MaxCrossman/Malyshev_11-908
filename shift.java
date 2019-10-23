import java.util.Scanner;

public class shift {
	public static void massiveShift(int [] a, int n) {
		int w = a.length;
		int [] b = new int [w];
		for (int i = 0; i < w;i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < w-n;i++) {			
			a[i+n]=b[i];
		}
		for (int i = w-n; i < w;i++) {
			a[i+n-w] = b[i];
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 10;
		int [] a = new int [x];
		for (int i = 0;i < x; i++) {
			a[i] = i;
			System.out.print("["+a[i]+"] ");
		}
		System.out.println("");
		System.out.println("");
		massiveShift(a,n);
		for (int i = 0;i < x; i++) {
			System.out.print("["+a[i]+"] ");
		}
	}	
}