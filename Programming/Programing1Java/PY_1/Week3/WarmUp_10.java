package Week3;

public class WarmUp_10 {

	public static void main(String[] args) { 
		 int[] a1 = { 3, 1, 4 }; 
		 int[] a2 = { 2, 0, 2, 5 }; 
		 
		 printArray(a1); // Prints 3 1 4 
		 System.out.println(); 
		 
		 printArray(a2); // Prints 2 0 2 5 
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1);
				System.out.print(" ");
			
		}
	}
	
}
