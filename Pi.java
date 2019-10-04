import java.util.Scanner;

public class Pi{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		if (n % 2 == 0){
			n--;
		}
		double psevdoPi = 0;
		while (n > 0) {
			psevdoPi -= (double)1 / n;
			n -= 2;
			psevdoPi += (double)1 / n;
			n -= 2;
		}
		double diff = (Math.PI - (4 * psevdoPi) );
		System.out.println(Math.PI+"   "+psevdoPi);
		System.out.println("Ur digit less "+diff+" than Number Pi");
	}
}