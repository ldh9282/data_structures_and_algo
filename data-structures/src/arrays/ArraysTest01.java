package arrays;

import java.util.ArrayList;

public class ArraysTest01 {

	public static void main(String[] args) {
		String[] strings = new String[4];
		strings[0] = "a";
		strings[1] = "b";
		strings[2] = "c";
		strings[3] = "d";
		
		// strings[2] : O(1)
		// push : O(1)
		// pop : O(1)
		
		// but "unshift" operation as adding item at the beginning of the array(=dynamic array): O(n)
		// because it is necessary to move the indexes depending on the size of the array.
		
		
		// cheet-sheet: Array's Time complexity
		// look-up : O(1)
		// push    : O(1)
		// pop     : O(1)
		// insert  : O(n)
		// delete  : O(n)
	}

}
