import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

interface Measurable {
    double getMeasure() throws FileNotFoundException;

    static double getAverage(String filename) throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        Scanner sc= new Scanner(fr);
        String line = sc.nextLine();
        double sum = 0;
        int count = 0;
        while (sc.hasNextLine()){
            sum+= Double.parseDouble(sc.nextLine().split(";")[5].substring(1));
            count++;
        }
        return sum/(double)count;
    }

    static double getMaximum(String filename) throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        Scanner sc= new Scanner(fr);
        String line = sc.nextLine();
        double max = Double.MIN_VALUE;
        while (sc.hasNextLine()){
            if (Double.parseDouble(sc.nextLine().split(";")[5].substring(1))>max){
                max = Double.parseDouble(sc.nextLine().split(";")[5].substring(1));
            }
        }
        return max;
    }

    static double getMinimum(String filename) throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        Scanner sc= new Scanner(fr);
        String line = sc.nextLine();
        double min = Double.MAX_VALUE;
        while (sc.hasNextLine()){
            if (Double.parseDouble(sc.nextLine().split(";")[5].substring(1))<min){
                min = Double.parseDouble(sc.nextLine().split(";")[5].substring(1));
            }
        }
        return min;
    }

    default boolean isGreaterThan(String filename, int a, int b) throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        Scanner sc= new Scanner(fr);
        String line = sc.nextLine();
        double an;
        double bn;
        if (a < b){
            for (int i = 0; i< a; i++){
                line = sc.nextLine();
            }
            an = Double.valueOf(line.split(";")[5].substring(1));
            for (int i = 0; i < b-a; i++){
                line = sc.nextLine();
            }
            bn = Double.valueOf(line.split(";")[5].substring(1));
        } else {
            for (int i = 0; i< b; i++){
                line = sc.nextLine();
            }
            bn = Double.valueOf(line.split(";")[5].substring(1));
            for (int i = 0; i < a-b; i++){
                line = sc.nextLine();
            }
            an = Double.valueOf(line.split(";")[5].substring(1));
        }
        boolean boo = false;
        if (an > bn){
            boo = true;
        }
        return boo;
    }
}