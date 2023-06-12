package arrays;

public class ArraysTest03_Example {

	public static void main(String[] args) {
		ArraysTest03_build_array myArray =
				new ArraysTest03_build_array();
		myArray.push("a");
		myArray.push("b");
		myArray.push("c");
		myArray.push("d");
		myArray.push("e");
		
		System.out.println(myArray.get(0)); // a
		System.out.println(myArray.pop());  // e
		
		myArray.delete(2); // c is deleted
		
		System.out.println(myArray.get(2));  // d
		
		
		myArray.insert(2, "c"); // c is added
		System.out.println(myArray.get(2)); // c
	}

}
