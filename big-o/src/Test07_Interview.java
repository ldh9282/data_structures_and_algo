import java.util.HashMap;
import java.util.Map;

public class Test07_Interview {
	
	public static boolean containsCommonItem1(char[] arr01,
			char[] arr02) {
		
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr02.length; j++) {
				if (arr01[i] == arr02[j]) {
					return false;
				}
			}
		}
		return false;
		
		// Time complexity: O(a*b)
		// We can say it as O of a times b.
		// The reason it's not O of n squared is 
		// that the two arrays have different lengths.
		
		// Space complexity: O(1)
		// Because we're not creating any new variables.
		// We're just using the inputs as arrays.
	}
	
	public static boolean containsCommonItem2(char[] arr01,
			char[] arr02) {
		
		HashMap<Character, Boolean> map = 
				new HashMap<Character, Boolean>();
		for (int i = 0; i < arr01.length; i++) {
			if (!map.containsKey(arr01[i])) {
				map.put(arr01[i], true);
			}
		}
		
		for (int i = 0; i < arr02.length; i++) {
			if (map.containsKey(arr02[i])) {
				return true;
			}
		}
		return false;
		// Time complexity: O(a + b)
		// We can say it as O of a plus b
		
		// Space complexity: O(a)
		// The reason is that we're creating the map object.
		// We're putting elements with for-loop.
	}
	public static void main(String[] args) {
		char[] arr01 = {'a', 'b', 'c', 'x'};
		char[] arr02 = {'x', 'y', 'r'};
		
		System.out.println("1. A Naive solution: "
				+ containsCommonItem1(arr01, arr02));
		System.out.println("2. A Scalable solution "
				+ "that improves the time complexity: "
				+ containsCommonItem2(arr01, arr02));
	}

}
