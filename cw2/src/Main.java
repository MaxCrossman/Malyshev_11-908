import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\Admin\\Documents\\proging\\Malyshev_11-908\\cw2\\src\\MOCK_DATA.csv");
        Scanner sc = new Scanner(file);
        int n = 0;
        while (sc.hasNextLine()){
            n++;
        }
        System.out.println(n);
    }
}
