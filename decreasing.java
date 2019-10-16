public class decreasing {
	public static int getMonoCount(int[] a) {
		int x = 0;
		int v = 0;
		int w = a.length - 2;
		for (int i = 0; i <= w; i++) {
			if (a[i] > a[i+1]) {
				v +=1;
				if (i == w) {
					x++;
				}
			}
			if ((i != 0)&&(a[i] < a[i-1])&&(a[i] < a[i+1])) {
				x++; 
				v = 0;
			}
		}		
		return x;
	}
	public static void main(String [] args) {
		int[] mas = new int[10];
		for (int i = 0; i <= 9; i++) {
			mas[i] = (int)(Math.random()*100);
		System.out.print("["+mas[i]+"]");
		}
		System.out.println("");
		// mas[0] = 6;
		// mas[1] = 4;
		// mas[2] = 3;
		// mas[3] = 7;
		// mas[4] = 11;
		// mas[5] = 19;
		// mas[6] = 20;
		// mas[7] = 18;
		// mas[8] = 16;
		// mas[9] = 14;
		System.out.println(getMonoCount(mas));
	}
}
		