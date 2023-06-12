import java.util.Arrays;

public class Test03_O_1 {
	public static void printTwoItems(String[] strArr) {
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
	}
	public static void main(String[] args) {
		
		String[] nemo = {"nemo"};
		String[] everyone = {"nemo", "nemo", "nemo", "nemo",
				"nemo", "nemo", "nemo", "nemo", "nemo",
				"nemo", "nemo" ,"nemo" ,"nemo"};
		String[] large = new String[100000];
		Arrays.fill(large, "nemo");
		double beforeTime = System.currentTimeMillis();
		// O(1)
		// It takes constant time 
		// This time line draws flat line
		// O means 'order of approximation'
		// We can say O(1) as  O of one
		printTwoItems(large);
		
		double afterTime = System.currentTimeMillis();
		
		double diffTime = afterTime - beforeTime;
		
		System.out.println(diffTime + "ms");
	}

}
