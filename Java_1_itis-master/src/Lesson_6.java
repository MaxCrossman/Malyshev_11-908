/**
* @author Shamil K
* 
*
*/

public class Lesson_6 {

	/* camel-case
	
		getName
		setName
		isNameInt
	*/
	public static double getSquare(double x) {
		return x * x;
	}
	
	public static double getSquare(int x) {
		return x * x;
	}
	
	public static double getSquare(double x, double y) {
		return x * y;
	}
	
	public static int randomInt(){
		return (int) (Math.random() * 100);
	}
	
	public static boolean isMagic(int k) {
		boolean isMagic = false;
		while (k > 0) {
			int digit = k % 10;
			if (digit == 8) {
				isMagic = true;
			}
			k /= 10;
		}
		
		return isMagic;
	}
	
	public static int getFactorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static int getFactorialRec(int n) {
		if (n <= 1 && n >= 0) return 1;
		return n * getFactorialRec(n - 1);
	}
	
	public static void main(String [] args) {
		int [][] grid = new int[12][8];
		
		int numRows = grid.length;
		int numCols = grid[0].length;
		
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				// grid[row][col] = row * numCols + col + 1;
				grid[row][col] = randomInt();
			}
		}
		
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				System.out.printf("%6.0f", getSquare(grid[row][col]));
			}
			System.out.println();
		}
		System.out.println();
		
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				System.out.printf("%6s", isMagic((int) getSquare(grid[row][col])));
			}
			System.out.println();
		}
	
		System.out.println(getFactorial(10));
		System.out.println(getFactorialRec(10));
	
		// int [][] arr = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
	
		
		// for (int row = 0; row < arr.length; row++) {
			// for (int col = 0; col < arr[row].length; col++) {
				// System.out.printf("%3d", arr[row][col]);
			// }
			// System.out.println();
		// }
	
	}
	
	
}