package Week3;

public class WarmUp_12 {
	
	public static double average(int[] arr) {
		
		double sum = 0.0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum / arr.length;
	}

	public static void main(String[] args) { 
		 int[] a1 = { 3, 7, 2 }; 
		 int[] a2 = { 2, 0, 2, 5 }; 
		 int[] a3 = { 5 }; 
		 
		 System.out.println(average(a1)); // Prints 4.0 
		 System.out.println(average(a2)); // Prints 2.25 
		 System.out.println(average(a3)); // Prints 5.0 
		} 

}
