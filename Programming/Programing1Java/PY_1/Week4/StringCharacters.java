package Week4;

import java.util.Scanner;

public class StringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		int letters = 0;
		int digits = 0;
		int others = 0;
		
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			
			//check if the letter is a-z or A-Z
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				letters++;
			}
			
			//check if digit (0-9)
			else if ((ch >= '0') && (ch <= '9')) {
				digits++;
			}
			
			// check others
			else {
				others++;
			}
		}
		
		System.out.println(letters + " letter(s)");
		System.out.println(digits + " digit(s)");
		System.out.println(others + " other character(s)"); 
	}

}
