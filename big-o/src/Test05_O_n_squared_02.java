import java.util.Arrays;
import java.util.Iterator;

public class Test05_O_n_squared_02 {
	public static void logAllPairsOfArray(String[] array1, 
			String[] array2) {
		
		for (int i = 0; i < array1.length; i++) { // O(a)
			for (int j = 0; j < array2.length; j++) { // O(b)
				System.out.println(array1[i] + "," + array2[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		String[] strArr1 = {"a", "b", "c", "d", "e"};
		String[] strArr2 = {"a", "b", "c", "d", "e"};
		double beforeTime = System.currentTimeMillis();
		
		// O(a*b)
		// Different terms for different inputs
		// We can say O(a*b) as 'O of multiply a by b'
		// Or 'O of a times b'
		
		logAllPairsOfArray(strArr1, strArr2);
		
		double afterTime = System.currentTimeMillis();
		
		double diffTime = afterTime - beforeTime;
		
		System.out.println(diffTime + "ms");
	}

}
