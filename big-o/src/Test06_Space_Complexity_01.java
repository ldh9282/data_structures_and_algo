
public class Test06_Space_Complexity_01 {
	// Let's think about Space complexity, not Time complexity
	// What Causes Space Complexity?
	//	• Variables
	//	• Data Structures
	//	• Function Call
	//	• Allocation

	public static void booo(int[] intArr) {
		for (int i = 0; i < intArr.length; i++) { // O(1) 
			System.out.println("boooo!");
			
			//Space complexity O(1)
		}
	}
	public static String[] hiArray(int[] intArr) { 
		String[] hiArray = {}; // O(1)
		for (int i = 0; i < intArr.length; i++) { // O(1)
			hiArray[i] = "hi";	// O(n)
		}
		return hiArray;
		
		//Space complexity O(n)
	}

}
