import java.util.Arrays;

public class Test04_BigO_Calculation_01 {
	public static int funChallenge(int[] arrInt) {
		int a = 10; // O(1)
		a = 50 + 3; // O(1)
		
		for (int i = 0; i < arrInt.length; i++) { // O(n)
			boolean b = true; // O(n)
			a++; // O(n)
			System.out.println(a); //O(n)
		}
		return a; // O(1)
		
		// Approximation
		// 4n + 3 => O(n)
		// We just say it approximately, not precisely
	}
	public static void main(String[] args) {
		int[] arrInt = new int[100000];
		int value = (int) (Math.random() * 10);
		Arrays.fill(arrInt, value);
		
		double beforeTime = System.currentTimeMillis();
		funChallenge(arrInt);
		double afterTime = System.currentTimeMillis();
		double diffTime = afterTime - beforeTime;
		System.out.println(diffTime + "ms");
	}

}
