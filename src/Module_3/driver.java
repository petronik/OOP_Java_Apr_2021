package Module_3;

import java.util.Arrays;

public class driver {

	
	
	public static void main(String[] args) {


		int[] intArr = new int[3];
		int[] intArr2 = { 1, 2, 3, 4, 5 };
		int[] intArr3 = new int[] { 7, 8, 9 };
		
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		
		// MyArrays.print(intArr2);
		MyArrays ma = new MyArrays();
		ma.printNonStatic(intArr2);
		
		System.out.println( Arrays.toString(intArr3)  ); 

		
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1.clone();  // MyArrays.copy(arr1);
		arr1[1] = 222;
		
		MyArrays.print(arr1);
		MyArrays.print(arr2);
		
		//System.out.println( MyArrays.sum(arr1) );
		// System.out.println( MyArrays.sum(arr2) );
		
		int[] arr3 = {10, 5, 1, -3, 10, 2, 4}; 
		int[] arr4 = new int[0];
		
		System.err.println("indexOf(10) = " + MyArrays.indexOf(arr3, 10) );
		System.err.println("lastIndexOf(10) = " + MyArrays.lastIndexOf(arr3, 10) );
		
		//System.out.println( "avarage = " +  MyArrays.avarage(arr4) + " " + (arr4 == null) );
		
		//System.out.println( "min = " + MyArrays.min(arr3) );
		// System.out.println( "max = " + MyArrays.max(arr3) );
		
		System.out.println( Arrays.toString(arr3) );
		
		//MyArrays.bubbleSort(arr3);
		MyArrays.quickSort(arr3, 0, arr3.length - 1);
		
		System.out.println( Arrays.toString(arr3) );
		
		int[] randArr = MyArrays.randomArray(1000000);
		
		// System.out.println( Arrays.toString(randArr) );
		
		
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		
		//MyArrays.bubbleSort(randArr); // 17s => 100.000
		// MyArrays.quickSort(randArr, 0, randArr.length - 1); //465ms => 1.000.000
		Arrays.sort(randArr); //234ms
		
		endTime = System.currentTimeMillis();
		
		System.out.println( "time: " + (endTime - startTime) + "ms");
		
		
		
		
		
		//Arrays.toString(null)
		
		
		// intArr[3] = 4;
		
		// String[] 

	}
}
