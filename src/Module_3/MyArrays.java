package Module_3;

public class MyArrays {

	public void printNonStatic(int[] arr) {

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static void print(int[] arr) {

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static int[] copy(int[] arr) {

		int[] copied = new int[arr.length];

		for (int i = 0; i < copied.length; i++) {
			copied[i] = arr[i];
		}

		return copied;
	}

	public static int sum(int[] arr) { // 1 2 3 77 55
		int res = 0;

		for (int a : arr) {
			res += a;
		}

		return res;
	}

	public static double avarage(int[] arr) {
		return arr.length == 0 ? 0 : (double) sum(arr) / arr.length;
	}

	public static int min(int[] arr) {

		int min = arr[0];

		for (int a : arr) {
			if (a < min) {
				min = a;
			}
		}

		return min;
	}

	public static int max(int[] arr) {

		int max = arr[0];

		for (int a : arr) {
			if (a > max) {
				max = a;
			}
		}

		return max;
	}

	public static void bubbleSort(int[] a) {
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}

	static int partition(int[] array, int begin, int end) {
		int pivot = end;

		int counter = begin;
		for (int i = begin; i < end; i++) {
			if (array[i] < array[pivot]) { // dir!!!
				int temp = array[counter];
				array[counter] = array[i];
				array[i] = temp;
				counter++;
			}
		}
		int temp = array[pivot];
		array[pivot] = array[counter];
		array[counter] = temp;

		return counter;
	}

	public static void quickSort(int[] array, int begin, int end) {
		if (end <= begin)
			return;
		int pivot = partition(array, begin, end);
		quickSort(array, begin, pivot - 1);
		quickSort(array, pivot + 1, end);
	}
	
	public static int[] randomArray(int len) {
		
		int[] arr = new int[len];
		
		int min = 1;
		int max = 1000;
		
		// int c = (int)Math.random() * ( max - min + 1) + min;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)( Math.random() * ( max - min + 1) + min );
		}
		
		return arr;
	}

	public static int indexOf(int[] arr, int el) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == el) return i;
		}
		return -1;
	}
	
	public static int lastIndexOf(int[] arr, int el) { 
		
		for (int i = arr.length - 1; i >= 0 ; i--) {
			if(arr[i] == el) return i;
		}
		
		return -1;
	}
}
