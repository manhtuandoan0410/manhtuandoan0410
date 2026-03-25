package Week4;

import java.util.Scanner;

public class RegexLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine().trim();
		
		if (str.matches("^[aeiouyåäöAEIOUYÅÄÖ]+$")) {
			System.out.print("Vowels only");
			
		} else {
			System.out.print("Not only vowels");
		}

	}

}
