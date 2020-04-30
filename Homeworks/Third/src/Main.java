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
        long start = System.currentTimeMillis();
        System.out.println(sa.countOfUniqueWordsUsingArrayList());
        long time = System.currentTimeMillis() - start;
        start += time;
        System.out.println(time);
        System.out.println(sa.countOfUniqueWordsUsingTreeSet());
        time = System.currentTimeMillis() - start;
        start += time;
        System.out.println(time);
        System.out.println(sa.countOfUniqueWordsUsingHashSet());
        time = System.currentTimeMillis() - start;
        start += time;
        System.out.println(time);

        StringArray sa2 =
                new StringArray("C:\\Proging\\Java\\11-908-java-homeworks-MaxCrossman" +
                                "\\Homeworks\\Third\\src\\Stishok.txt");
        String[][] ar = sa2.topFiftyWordsInDoubleArray();
        for (int i = 0; i < 50; i++) {
            System.out.println(ar[0][i]+"   "+ar[1][i]);
        }
    }
}
