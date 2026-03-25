package Week4;

import java.util.Scanner;

public class StringStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine();
	
		int characters = 0;
		for (int i = 0; i < string.length(); i++) {
			characters ++;
		}
		
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
		System.out.println(characters + " characters");
	

	}

}
