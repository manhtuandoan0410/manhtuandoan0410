package Week3;

public class WarmUp_11 {

	public static void main(String[] args) { 
		 String[] a1 = {"t", "r", "a", "m", "s"}; 
		 String[] a2 = {"r", "a", "t"}; 
		 
		 printReverse(a1); // Prints smart 
		 System.out.println(); 
		 
		 printReverse(a2); // Prints tar 
	} 
	
	public static void printReverse(String[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
	

}
