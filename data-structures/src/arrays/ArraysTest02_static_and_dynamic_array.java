package arrays;

import java.util.ArrayList;

public class ArraysTest02_static_and_dynamic_array {

	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		
		// ArraysList is a dynamic array that can be resized. 
		// This is possible because the dynamic array is copied as a new array. 
		// To explain more clearly, this "push" operation copies all indexes of the dynamic array.
		
		// cheet-sheet: Dynamic array's Time complexity
		
		// look-up : O(1)
		// push    : O(1) or O(n) when the dynamic array needs to be resized
		// pop     : O(1)
		// insert  : O(n)
		// delete  : O(n)
	}

}
