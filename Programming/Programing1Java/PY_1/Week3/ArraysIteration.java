package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIteration {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter an integer: ");
			numbers[i] = Integer.parseInt(input.nextLine());
		}
		
		Arrays.sort(numbers);
		
		System.out.print("Sorted descending: ");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i]);
			if (i < numbers.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		input.close();
		
	}

}
