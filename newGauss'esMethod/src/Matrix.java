import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Matrix {
    private int [][]matrix;
    private int []colomn;

    public Matrix(int[][] mx,boolean colomn){
        this.colomn = new int[mx.length];
        if (colomn){
            matrix = new int[mx.length][mx[0].length-1];
            for (int i = 0; i < mx.length;i++){
                for (int j = 0;j < matrix[0].length; j++){
                    matrix[i][j] = mx[i][j];
                }
                this.colomn[i] = mx[i][mx.length-1];
            }
        } else{
            matrix = mx;
            for (int i = 0; i < mx.length; i++){
                this.colomn[i] = 0;
            }
        }
    }

    public Matrix(int [][] mx, int[] colomn){
        matrix = mx;
        this.colomn = colomn;
    }

    public Matrix(int m, int n){
        matrix = new int[m][n];
        colomn = new int[m];
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите значения матрицы через пробел: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) matrix[i][j] = sc.nextInt();
        }
        System.out.println("Вводите значения расширения матрицы через пробел: ");
        for (int i = 0; i < m; i++){
            colomn[i] = sc.nextInt();
        }
    }

    public Matrix(int m, int n, String filename) throws FileNotFoundException {
        FileReader fr = new FileReader("filename");
        Scanner sc = new Scanner(fr);
        String line;
        matrix = new int[m][n];
        colomn = new int[m];
        for (int i = 0; i < m; i++){
            line = sc.nextLine();
            line = line.substring(1,line.length()-1);
            for (int j = 0; j < n; j++){
                matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
            }
            colomn[i] = Integer.parseInt(line.split("|")[1]);
        }
    }

    public void addLine(int i, int j, int lambda){
        for (int k = 0; k < matrix[0].length; k++){
            matrix[i][k] = matrix[j][k]*lambda;
        }
    }

    public void multLine(int i, int lambda){
        for (int k = 0; k < matrix[0].length; k++){
            matrix[i][k]*= lambda;
        }
    }

    public void exchangeLinesValues(int i, int j){
        int t;
        for (int k = 0; k < matrix[0].length; k++){
            t = matrix[i][k];
            matrix[i][k] = matrix[j][k];
            matrix[j][k] = t;
        }
    }

    public void toSteppedAppearance(){
        for (int )
    }
}
