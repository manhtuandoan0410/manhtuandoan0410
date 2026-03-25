package Week3;

public class ArraysMatrix {

	public static void printMatrixSum(int[][] arr1, int[][] arr2) {
		
		//works if only both matrices have same dimensions
		int rows = arr1.length;
		int cols = arr1[0].length;
		
		//calculate sum for each position and print row by row ==> the same like table?
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int sum = arr1[i][j] + arr2[i][j];
				System.out.print(sum + " ");
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) { 
		 int[][] m1 = { {1, 2, 0}, {2, 3, 4} }; 
		 int[][] m2 = { {3, 2, 5}, {6, 4, 3} }; 
		 int[][] m3 = { {1, 1, 1, 1}, {3, 2, 3, 1}, {2, 2, 2, 2} }; 
		 int[][] m4 = { {2, 2, 3, 3}, {2, 3, 1, 0}, {1, 2, 3, 4} }; 
		 
		 printMatrixSum(m1, m2); 
		 System.out.println(); 
		 
		 printMatrixSum(m3, m4); 
	} 

}
