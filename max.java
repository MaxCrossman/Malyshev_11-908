public class max {
	public static int maxOfEven(int[] a) {
		int w = a.length - 1;
		int x = -1;
		for ( int i = 0; i <= w; i++) {
			if (((a[i]%2)!=0)&&(a[i]>x)) {
				x = a[i];
			}
		}
		return x;
	}
	public static int maxOfOdd(int[] a) {
		int w = a.length - 1;
		int x = -1;
		for ( int i = 0; i <= w; i++) {
			if (((a[i]%2)==0)&&(a[i]>x)) {
				x = a[i];
			}
		}
		return x;
	}
	public static void main(String [] args) {
		int [] mas = new int[10];
		for (int i = 0;i <= 9;i++) {
			mas[i] = (int)(Math.random()*100);
			System.out.print("["+mas[i]+"];");
		}
		System.out.println("");
		System.out.println(maxOfEven(mas));
		System.out.println(maxOfOdd(mas));
	}
}