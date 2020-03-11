/**
* @author Shamil K
* 
* Двумерные массивы.
* Matrix17
* Matrix20
* Matrix27
* Matrix41
* Matrix47
* Matrix61
* Matrix88
*
*
*
*/

import java.util.Arrays;

public class Lesson_8 {

	public static int [][] matrix;
	
	public static int[] sumMultKRow(int k) {
		int [] sumMult = {0, 1};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == k) {
					sumMult[0] += matrix[i][j];
					sumMult[1] *= matrix[i][j];
				}
			}
		}
		return sumMult;
	}

	public static int[] multCols() {
		int [] sumMult = new int [matrix[0].length];
		for (int j = 0; j < matrix[0].length; j++) {
			sumMult[j] = 1;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sumMult[j] *= matrix[i][j];
			}
		}
		return sumMult;
	}

	// public static int maxInMinRow() {
		// int max = 0;
		// int minRow = 0;
		// int [] minRowValue = new matrix[i];
		// for (int i = 0; i < matrix.length; i++) {
			// for (int j = 0; j < matrix[0].length; j++) {
				// if (minRowValue < matrix[i][j]) {
					// minRowValue[i] = matrix[i][j];
				// }
			// }
		// }
		// for (int i = 0; i < minRowValue.length; i++) {
			
		// }
		
		// return sumMult;
	// }

	public static int [][] random2DArray(int m, int n){
		int [][] array = new int [m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}
		}
		return array;
	}
	
	
    
    public static int firstMaxElements_(int matr[][]) {
        int col = 0;
        int[] maxCol = new int[matr[0].length];
        for (int j = 0; j < matr[0].length; j++) {
            for (int i = 0; i < matr.length; i++) {
                for (int k = i + 1; k < matr.length; k++) {
                    if (matr[i][j] == matr[k][j]) {
                        maxCol[j]++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(maxCol));
        int maxCount = maxCol[0];
        for (int k = 1; k < maxCol.length; k++) {
            if (maxCount < maxCol[k]) {
                maxCount = maxCol[k];
                col = k;
            }
        }

        return col;
    }

	
    public static int firstMaxElements(int matr[][]) {
        int col = 0;
        int[] maxCol = new int[matr[0].length];
        int countValues[][] = new int[matr.length][matr[0].length];
        for (int j = 0; j < matr[0].length; j++) {
            for (int i = 0; i < matr.length; i++) {
                for (int k = 0; k < matr.length; k++) {
                    if (matr[i][j] == matr[k][j]) {
                        countValues[i][j]++;
                    }
                }
            }
        }
        System.out.println(matrixToString(countValues));
        int ma = countValues[0][0];
        for (int i = 0; i < countValues.length; i++) {
            for (int j = 0; j < countValues[0].length; j++) {
                if (ma < countValues[i][j]) {
                    ma = countValues[i][j];
                    col = j;
                }
            }
        }
        System.out.println(ma);

        return col;
    }
	
	
	public static String matrixToString(int [][] matr) {
		String result = "";
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[0].length; j++) {
				result += String.format("%4d", matr[i][j]);
			}
			result += "\n";
		}
		return result;
	}
	
	public static String matrixToString() {
		String result = "";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				result += String.format("%4d", matrix[i][j]);
			}
			result += "\n";
		}
		return result;
	}

	public static void main(String [] args) {
		matrix = random2DArray(12, 5);
		System.out.println(matrixToString());
		System.out.printf("Сумма 3 строки = %d, произведение = %d%n", sumMultKRow(3)[0], sumMultKRow(3)[1]);
		System.out.println("Произведение столбцов = " + Arrays.toString(multCols()));
       		System.out.println("Номер столбца с максимальным число одинаковых элементов:\n" + firstMaxElements(matrix));
	}
	
	
}
