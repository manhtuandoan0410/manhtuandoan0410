package Week3;

public class ArrayFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {6, -4, 5, 3, -1, 0, 8};
	
		//first pass: print all positive values including 0 on 1 line
		//System.out.print("Positive values: ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				System.out.print(num[i]);
				if (i < num.length-1) {
					System.out.print(" ");
				}
				
			}
		}
	
		System.out.println(); //new line

		// second pass: print all negative values on next line
	
		//System.out.print("Negative values: ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0) {
				System.out.print(num[i]);
				if (i < num.length-1) {
					System.out.print(" ");
				}
			}
				
		}
		System.out.println();
	}

}
