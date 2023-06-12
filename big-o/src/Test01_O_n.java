import java.util.Arrays;

public class Test01_O_n {

	public static void main(String[] args) {
		String[] nemo = {"nemo"};
		String[] everyone = {"nemo", "nemo", "nemo", "nemo",
				"nemo", "nemo", "nemo", "nemo", "nemo",
				"nemo", "nemo" ,"nemo" ,"nemo"};
		String[] large = new String[100000];
		Arrays.fill(large, "nemo");
		double beforeTime = System.currentTimeMillis();
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
