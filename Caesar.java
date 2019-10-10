import java.util.Scanner;

public class Caesar{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your message");
		String m = sc.next();
		System.out.println("Enter the number");
		int n = (sc.nextInt())%26;
		String abc = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		if (n < 0) {
			for (int i = 0; i < m.length(); i++) {
			char l = m.charAt(i);
			int t = abc.lastIndexOf(l);
			System.out.print(abc.charAt(t+n));
			}
		} else {
		for (int i = 0; i < m.length(); i++) {
			char l = m.charAt(i);
			int t = abc.indexOf(l);
			System.out.print(abc.charAt(t+n));
			}
		}
	}
}
		