package basicCalculations;

import java.util.Scanner;

public class SoftDrinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int students = Integer.parseInt(input.nextLine().trim());
		
		System.out.print("Enter the number of bottles: ");
		int bottles = Integer.parseInt(input.nextLine().trim());
		
		int perStudent = bottles / students;
		int remainder = bottles % students;
		
		System.out.println();
		System.out.println("There will be " + perStudent + " bottles for each student."); 
		System.out.println("There will be " + remainder + " leftover bottles.");
	}

}
