/**
* @author Shamil K
* 
*
*/

package stud;

public class Lesson_7 {

	public static int [] randomArray(int [] array){
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}
	
	public static String arrayToString(int [] numbers) {
		String result = "";
		for (int i = 0; i < numbers.length; i++) {
			result += (i == 0 ? "[" : "") + numbers[i] + (i < numbers.length - 1 ? ", " : "]");
		}
		return result;
	}
	
	/*
	maximal element of array
	*/
	public static int max(int [] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) max = arr[i];
		}
		return max;
	}
	
	/*
	minimal element of array
	*/
	public static int min(int [] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min < arr[i]) min = arr[i];
		}
		return min;
	}
	
	/*
		первое вхождение экстремального элемента
		extr = min|max
	*/
	public static int indexOfMax(int [] arr, String extr) {
		int extremal = extr == "min" ? min(arr) : extr == "max" ? max(arr) : -1;
		for(int i = 0; i < arr.length; i++) {
			if (extremal == arr[i]) return i;
			
		}
		return -1;
	}
	
	/*
		Отсортировать массив таким образом, что сначала идут четные номера элемента, затем нечетные. 
		(А_2, А_4, А_1, А_3).
	*/
	// public static int [] sortEvenOdd(int [] array) {
		// return {};
		
	// }
	/*
		Найти максимальный/минимальный элемент среди четных/нечетных
	*/
	public static int maxOfEven(int [] array) {
		return 0;
		
	}
	
	/*
		Найти количество участков массива, на которых его элементы монотонно убывают.
	*/
	public static int getMonoCount() {
		return 0;
		
	}
	
	/*
		Поменять местами содержимое двух заданных массивов.
	*/
	public static int changeArrayValues(int [] a, int [] b) {
		return 0;
	}
	
	/*
		У заданного массива осуществить циклический сдвиг на N вправо.
	*/
	
	/*
		Добавить нулевой элемент после максимального и минимального элемента массива. 
	*/
	
	public static void main(String [] args) {
		int [] array = new int[10];
		array = randomArray(array);
		System.out.println(arrayToString(array));
		System.out.printf("Максимум последовательности: %d%n", max(array));
		System.out.printf("Первый максимальный элемент: %d%n", indexOfMax(array, "max"));
		
	}
	
	
}