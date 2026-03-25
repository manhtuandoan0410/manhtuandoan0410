package Week4;

import java.util.Scanner;

public class RegexStudentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student number: ");
		String studentNumber = input.nextLine().trim();
		
		if (studentNumber.matches("^2\\d{7}$")) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid student number");
		}
		
	}

}
