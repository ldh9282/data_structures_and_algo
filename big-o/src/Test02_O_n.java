import java.util.Arrays;

public class Test02_O_n {

	public static void main(String[] args) {
		
		String[] nemo = {"nemo"};
		String[] everyone = {"nemo", "nemo", "nemo", "nemo",
				"nemo", "nemo", "nemo", "nemo", "nemo",
				"nemo", "nemo" ,"nemo" ,"nemo"};
		String[] large = new String[100000];
		Arrays.fill(large, "nemo");
		double beforeTime = System.currentTimeMillis();
		
		// O(n)
		// It takes 'linear Time'
		// O means 'order of approximation'
		// n is the number of data
		// we can say O(n) as  O of n.
		for (int i = 0; i < large.length; i++) {
			if (large[i] == "nemo") {
				System.out.println("Found Nemo!");
			}
			
		}
		
		double afterTime = System.currentTimeMillis();
		
		double diffTime = afterTime - beforeTime;
		
		System.out.println(diffTime + "ms");
	}

}
