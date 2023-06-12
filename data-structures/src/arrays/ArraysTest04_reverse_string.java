package arrays;

public class ArraysTest04_reverse_string {
	public static String reverseString01(String str) {
		String reverseStr = "";
		for (int i =  str.length()-1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}
	
	public static String reverseString02(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public static String recursiveReversal (String str) {
	    if (str.length() == 0)  //breakpoint 
	       return "";
	    return recursiveReversal(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		String str = "Hello Java's World!";
		
		System.out.println("I made a method: " + reverseString01(str));
		
		System.out.println("I use a Built-in method: " + reverseString02(str));
	}
}
