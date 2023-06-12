package hash_tables;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashTablesTest03_FirstRecurringChar {
	
	// A naive solution that has a little mistake
	// The Time complexity is O of n squared
	public static Object getFirstRecurringObject(Object[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				if (inputArray[i].equals(inputArray[j])) {
					return inputArray[i];
				}
			}
		}
		
		return null;
	}
	
	// A naive solution that fixes a mistake
	// If a nested loop index is smaller than a found Index, change it.
	public static Object getFirstRecurringObject2(Object[] inputArray) {
		int foundIdx = 0;
		
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				if (inputArray[i].equals(inputArray[j]) &&  (foundIdx == 0 || foundIdx > j)) {
					foundIdx = j;
					
				}
			}
		}
		
		if (foundIdx == 0) {
			return null;
		}
		
		return inputArray[foundIdx];
	}
	
	// A better solution: hash-set
	// The Time complexity is linear time.
	public static Object getFirstRecurringObjectBetter(Object[] inputArray) {
		HashSet<Object> map = new HashSet<>();
		for (Object obj : inputArray) {
			if (!map.contains(obj)) {
				map.add(obj);
			} else {
				return obj;
			}
		}
		
		return null;
	}

	public static void main(String[] args) {
		String[] inputArray = {"a", "b", "c", "c", "d", "c"};  // c
		Integer[] inputArray02 = {2,1,1,2,3,5,1,2,4};		   // 1
		
		System.out.println(getFirstRecurringObject(inputArray));		
		System.out.println(getFirstRecurringObjectBetter(inputArray));
		
		System.out.println(getFirstRecurringObject(inputArray02));		
		System.out.println(getFirstRecurringObjectBetter(inputArray02));	
		System.out.println(getFirstRecurringObject2(inputArray02)); // A naive solution that fix a mistake
	}
}
