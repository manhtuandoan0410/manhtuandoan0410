package Week4;

import java.util.Scanner;

public class StringUsername {
	
	public static String CreateUsername(String givenName, String surname) {
		//check givenName length & surname length
		if (givenName.length() < 3 || surname.length() < 4) {
			return "Not enough letters to create a username!";
		} else {
			return surname.substring(surname.length() - 3, surname.length()) + givenName.substring(0,2).toLowerCase();
		}
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter given name: ");
		String givenName = input.nextLine();
		
		System.out.print("Enter surname: ");
		String surname = input.nextLine();
		
		//call method and print result
		System.out.println(CreateUsername(givenName, surname));

	}

}
