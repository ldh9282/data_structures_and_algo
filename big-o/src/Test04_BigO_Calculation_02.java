import java.util.Arrays;
import java.util.Iterator;

public class Test04_BigO_Calculation_02 {
	public static void funChallenge(int[] arrInt, 
			String[] arrString) {
		
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]); // O(a)
		}
		
		for (int i = 0; i < arrString.length; i++) {
			System.out.println(arrString[i]); // O(b)
		}
		
		// Different terms for different inputs
		// We should say O(a+b), not O(n) as O(2n)
	}
	public static void main(String[] args) {
		int[] arrInt = new int[100000];
		int value = (int) (Math.random() * 10);
		Arrays.fill(arrInt, value);
		
		String[] arrString = new String[10000];
		Arrays.fill(arrString, "This is a string");
		
		double beforeTime = System.currentTimeMillis();
		funChallenge(arrInt, arrString); // O(a + b)

		double afterTime = System.currentTimeMillis();
		double diffTime = afterTime - beforeTime;
		System.out.println(diffTime + "ms");
	}

}
