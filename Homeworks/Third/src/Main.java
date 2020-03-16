import org.w3c.dom.DOMStringList;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Proging\\Java\\11-908-java-homeworks-MaxCrossman\\Homeworks\\Third\\src\\satellite_lurics.txt";
        StringArray sa = new StringArray(path);
        sa.capitalizePlurals();
        sa.forEach(System.out::println);
        sa.removePlurals();
        System.out.println(sa.toString());
    }
}
