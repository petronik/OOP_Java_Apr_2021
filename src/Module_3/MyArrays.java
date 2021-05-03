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
		return arr.length == 0 ? 0 : (double)sum(arr) / arr.length;
	}
	
	public static int min(int[] arr) {
		
		int min = arr[0];
		
		for (int a : arr) {
			if(a < min) {
				min = a;
			}
		}
		
		return min;
	}
	
	public static int max(int[] arr) {
		
		int max = arr[0];
		
		for (int a : arr) {
			if(a > max) {
				max = a;
			}
		}
		
		return max;
	}
}
