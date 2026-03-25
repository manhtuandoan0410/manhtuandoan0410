package firstJavaProgams;

import java.util.Scanner;


public class PersonProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter given name: ");
		String givenName = input.nextLine();
		
		System.out.print("Enter profession: ");
		String profession = input.nextLine();
		
		System.out.println();
		
		String result = givenName + " is a " + profession + " who is " + age + " years of age.";
		System.out.println(result);
		
	}

}
