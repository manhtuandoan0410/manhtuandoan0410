package Week4;

import java.util.Scanner;

public class StringPasswordStrength {

	public static boolean checkStrength(String username, String password) {
		
		//check number of characters, at least 9
		if (password.length() < 9) {
			return false;
		}
		
		//check password if contains username
		if (password.toLowerCase().contains(username.toLowerCase())) {
			return false;
		}
		
		return true; // if both cases failed
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String username = input.nextLine();
		
		System.out.print("Enter password: ");
		String password = input.nextLine();
		
		//call methods and print result
		if (checkStrength(username, password)) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}

	}

}
