package arrays;

public class ArraysTest05_merge_sorted_arrays {
	public static int[] mergeTwoSoretedArrays(int[] arr01, int[] arr02) {
		if (arr01.length == 0) {
			return arr02;
		}
		if (arr02.length == 0) {
			return arr01;
		}
		
		int[] mergedArr = new int[arr01.length + arr02.length];
		
		for (int i = 0, j = 0, k = 0; i < mergedArr.length; i++) {
			if (j != arr01.length && ( k == arr02.length || arr01[j] < arr02[k])) {
				mergedArr[i] = arr01[j];
				j++;
			} else {
				mergedArr[i] = arr02[k];
				k++;
			}
		}
		
		return mergedArr;
	}
	
	public static void main(String[] args) {
		int[] arr01 = {1, 3, 10, 30, 40};  	// a first sorted array
		int[] arr02 = {-3, 5, 10, 20, 100, 150}; // a second sorted array
		
		int[] mergedArr = mergeTwoSoretedArrays(arr01, arr02);
		
		for (int i = 0; i < mergedArr.length; i++) {
			System.out.print(mergedArr[i] + "\t");
		}
	}
}
