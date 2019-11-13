import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Gauss {

    public static double[][] enterMatrix(String filename) throws IOException {
        FileReader fr2 = new FileReader(filename);
        Scanner sc2 = new Scanner(fr2);
        int x = 0;
        String check = "";
        while(sc2.hasNextLine()){
            check = sc2.nextLine();
            x++;
        }
        sc2.close();

        String [] checker = check.split("\\s+");
        int y = checker.length;
        fr2.close();
        FileReader fr = new FileReader("matrix4gauss.txt");

        double [][] mx = new double[x][y];
        Scanner sc = new Scanner(fr);
        int z = 0;
        while(sc.hasNextLine()) {
            String l = sc.nextLine();
            String [] dgts = l.split("\\s+");
            for (int j = 0; j < dgts.length; j++) {
                mx[z][j] = Integer.parseInt(dgts[j]);

            }
            z++;
        }
        fr.close();


        return mx;
    }

    public static double[][] roundArray(double[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                a[i][j] = (double)Math.round(a[i][j]);
            }
        }
        return a;
    }

    public static String arrayToString(double [][] mx) {
        String result = "";
        for (int i = 0; i < mx.length; i++){
            for (int j = 0; j < mx[0].length; j++){
                result += String.format("%11.1f",mx[i][j]);
            }
            result +="\n";
        }
        return result;
    }

    public static double[] multipleArray(double [] a,double x) {
        for (int j = 0; j < a.length; j++){
            a[j]*= x;

        }
        return a;
    }

    public static double[][] methodGauss(double[][] a) {
        for (int i = 0;i < a.length-1;i++){
            a = zeroArray(a,i);
        }
        return a;
    }

    public static double [][] zeroArray(double [][] a,int k){
        while (a[a.length - 1][k] != 0) {
            if((int)(a[k][k]) % 2 == 1){
                a[k] = multipleArray(a[k],2);
            }
            double mod = 0;
            for (int i = k; i < a.length - 1; i++) {
                if(a[i+1][k] == 0) continue;
                if ((Math.abs(a[i + 1][k]) < Math.abs(a[i][k])) & (a[i + 1][k] != 0) & (mod == 0) & (i != a.length - 1)) {
                    a[i + 1] = multipleArray(a[i + 1], a[k][k]);
                }
                if((int)(a[i+1][k]) % 2 == 1){
                    a[i+1] = multipleArray(a[i+1],2);
                }
                if (mod == 0) {
                    mod = a[i + 1][k] / a[k][k];
                }
                for (int j = k; j < a[i].length; j++) {
                    a[i + 1][j] -= (a[k][j] * mod);
                }
            }
        }
        return a;
    }

    public static double [][] getPart(double [][] array,int k){
        int buf = (int)(array[k][array[0].length-1] / array [k][k]);
        System.out.println("x" + (int)(k+1) + " = " + buf);
        for(int i = 0; i < k;i++){
            array[i][k] *= buf;
        }
        return array;
    }

    public static double [][] sumOther(double[][] a, int k){
        for(int i = 0; i < k;i++){
            a[i][a[0].length-1] = (a[i][a[0].length-1] + (-1 * a[i][k]));
        }
        return a;
    }

    public static void getAnswer(double [][] a){
        for(int i = a.length - 1; i > -1; i--){
            a = getPart(a,i);
            a =sumOther(a,i);
        }

    }





    public static void main (String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        double[][] mx = enterMatrix(s);
        mx = roundArray(methodGauss(mx));
        getAnswer(mx);
    }
}