package basicCalculations;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MealProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormatSymbols symbol = new DecimalFormatSymbols();
		symbol.setDecimalSeparator(',');
		DecimalFormat twoDecimals = new DecimalFormat("0.00", symbol);

		System.out.print("Enter the price of food: ");
		double foodPrice = Double.parseDouble(input.nextLine().trim().replace(',', '.'));

		System.out.print("Enter the tax rate: ");
		double taxRate = Double.parseDouble(input.nextLine().trim().replace(',', '.'));

		System.out.print("Enter the tip percentage: ");
		double tipRate = Double.parseDouble(input.nextLine().trim().replace(',', '.'));

		double tipAmount = foodPrice * tipRate / 100;
		double taxAmount = foodPrice * taxRate / 100;
		double totalCost = foodPrice + taxAmount + tipAmount;

		String result = "The total cost is " + twoDecimals.format(totalCost);

		System.out.println();
		System.out.println(result);

	}

}
