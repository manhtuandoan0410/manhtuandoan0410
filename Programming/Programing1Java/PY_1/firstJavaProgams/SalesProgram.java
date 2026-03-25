package firstJavaProgams;

import java.util.Scanner;

public class SalesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter price: ");
		int price = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter product name: ");
		String name = input.nextLine();
		
		System.out.print("Enter discount: ");
		int discount = Integer.parseInt(input.nextLine());
		
		int newPrice = price - discount;
		String result = "The selling price of a " + name + " is " + 
						newPrice + " euros.";
		
		System.out.println();
		System.out.println(result);

	}

}
