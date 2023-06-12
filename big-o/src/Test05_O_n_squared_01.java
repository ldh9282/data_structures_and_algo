import java.util.Arrays;
import java.util.Iterator;

public class Test05_O_n_squared_01 {
	public static void logAllPairsOfArray(String[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		String[] strArr = {"a", "b", "c", "d", "e"};
		
		double beforeTime = System.currentTimeMillis();
		
		// O(n^2)
		// It takes 'quadratic time'
		// This time line draws 'quadratic function'
		// O means 'order of approximation'
		// We can say O(n^2) as 'O of n squared'
		// Or 'O of n to the power of two'
		// Or 'O of n to the second power'
		
		logAllPairsOfArray(strArr);
		
		double afterTime = System.currentTimeMillis();
		
		double diffTime = afterTime - beforeTime;
		
		System.out.println(diffTime + "ms");
	}

}
