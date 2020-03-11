import java.util.Scanner;

public class Main {
        public static boolean f() {
            try {
                return true;
            } finally {
                return false;
            }
        }
        public static void main(String[] args) {
            System.out.println(f());
        }
}
