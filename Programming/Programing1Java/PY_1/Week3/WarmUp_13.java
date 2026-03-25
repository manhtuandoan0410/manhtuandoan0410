package Week3;

public class WarmUp_13 {
	
	public static String findLongest(String[] arr) {
		String longest = arr[0]; //assume first string is the longest so far
		
		//outer loop scans each string in the array
		for (int i = 0; i < arr.length; i++) {
			int currentLength = 0;
			
			
			// nested loop or inner loop counts characters
			for (int j = 0; j < arr[i].length(); j++) {
				currentLength++;
			}
			
			// compare lengths
			int longestLength = 0;
			for (int k = 0; k < longest.length(); k++) {
				longestLength++;
			}
			
			if (currentLength > longestLength) {
				longest = arr[i]; // update the longest if the currentLength is longer
			}
		}
		
		return longest;
		
	}
	

	public static void main(String[] args) { 
		 String[] a1 = {"one", "hi", "hello", "ho", "house"}; 
		 String[] a2 = {"goodbye", "hi", "how"}; 
		 
		 System.out.println(findLongest(a1)); // prints hello 
		 System.out.println(findLongest(a2)); // prints goodbye 
		} 

}
