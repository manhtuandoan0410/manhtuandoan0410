package firstJavaProgams;

import java.util.Scanner;

public class WelcomeProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = input.nextLine();
		
		System.out.print("Enter title: ");
		String title = input.nextLine();
		
		System.out.print("Enter phrase: ");
		String phrase = input.nextLine();
		
		System.out.println();
		System.out.println(phrase + " " + title + " " + name);
		
		input.close();
	}

}