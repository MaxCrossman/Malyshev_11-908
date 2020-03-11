/**
* @author Shamil K
* 
*
*/

package stud;
import stud.Lesson_7;

public class Lesson_9 {

	// public static int [] Lesson_7.randomArray(int [] array){
		// for (int i = 0; i < array.length; i++) {
			// array[i] = (int) (Math.random() * 10);
		// }
		// return array;
	// }
	
	// public static String arrayToString(int [] numbers) {
		// String result = "";
		// for (int i = 0; i < numbers.length; i++) {
			// result += (i == 0 ? "[" : "") + numbers[i] + (i < numbers.length - 1 ? ", " : "]");
		// }
		// return result;
	// }
	
	public static void bubbleSort(int [] arr) {
		boolean sorted = false;
		int tmp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					sorted = false;
				}
			}
		}
	}
	public static void selectionSort(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			int tmpId = 1;
			System.out.printf("tmp = %d, tmpId=%d%n", tmp, tmpId);
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < tmp) {
					tmp = arr[j];
					tmpId = j;
				}
				int temp = arr[i];
				arr[i] = tmp;
				arr[tmpId] = temp;
			}
			System.out.println("SelectionSort = " + Lesson_7.arrayToString(arr));
			System.out.println("-----"); 
		}
		
	}
	public static void intersectionSort(int [] arr) {
		int tmp;
		for (int i = 1; i < arr.length; i++) {
			tmp = arr[i];
			System.out.println("tmp = " + tmp + ";");
			int j = i - 1;
			System.out.println("j = " + j + ";");
			System.out.println("while tmp < arr[j]" + tmp + "<"+arr[j]);
			
			while (j >= 0 && tmp < arr[j]) {
				System.out.println("j = " + j + ";");
				arr[j+1] = arr[j];
				System.out.println("a[j+1] = " + arr[j+1] + "; arr[j] = " + arr[j]);
				j--;
			}
			arr[j+1] = tmp;
			System.out.println("arr[j+1] = tmp = " + tmp); 
			System.out.println("IntersectionSort = " + Lesson_7.arrayToString(arr));
			System.out.println("-----"); 
		}
		
	}
	
	public static void quickSort(int [] arr, int low, int high) {
		if (low >= high) return;
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
		System.out.println("pivot = "+pivot);
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) i++;
			while (arr[j] > pivot) j--;
			System.out.printf("i = %d, j = %d%n", arr[i], arr[j]);
			if  (i <= j) {
				System.out.printf("arr[i] = arr[j] | %d = %d%n", arr[i], arr[j]);
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		System.out.printf("i = %d, j = %d, low = %d, high = %d%n", i, j, low, high);
		System.out.println(Lesson_7.arrayToString(arr));
		if (low < j) quickSort(arr, low, j);
		if (high > i) quickSort(arr, i, high);
	}

	public static void main(String [] args) {
		int [] array = new int[10];
		System.out.println(Lesson_7.arrayToString(Lesson_7.randomArray(array)));
		bubbleSort(array);
		System.out.println("BubbleSort = " + Lesson_7.arrayToString(array));
		System.out.println(Lesson_7.arrayToString(Lesson_7.randomArray(array)));
		intersectionSort(array);
		System.out.println("IntersectionSort = " + Lesson_7.arrayToString(array));
		System.out.println(Lesson_7.arrayToString(Lesson_7.randomArray(array)));
		selectionSort(array);
		System.out.println("SelectionSort = " + Lesson_7.arrayToString(array));
		System.out.println(Lesson_7.arrayToString(Lesson_7.randomArray(array)));
		quickSort(array, 0, array.length - 1);
		System.out.println("QuickSort = " + Lesson_7.arrayToString(array));
	
	
	}
	
	
}