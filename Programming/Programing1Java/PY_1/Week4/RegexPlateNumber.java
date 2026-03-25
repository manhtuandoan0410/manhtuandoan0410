package Week4;

import java.util.Scanner;

public class RegexPlateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter plate number: ");
		String plateNumber = input.nextLine().trim();
		
		if (plateNumber.matches("^[A-Z]{3}-\\d{3}$")) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid plate number");
		}

	}

}
