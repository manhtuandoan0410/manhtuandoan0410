package firstJavaProgams;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DecimalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		double a = Double.parseDouble(input.nextLine().trim().replace(',', '.'));
		
		System.out.print("Enter a decimal number: ");
		double b = Double.parseDouble(input.nextLine().trim().replace(',', '.'));
		
		double c = a * b;
		DecimalFormatSymbols symbol = new DecimalFormatSymbols();
		symbol.setDecimalSeparator(',');
		DecimalFormat twoDecimals = new DecimalFormat("0.00", symbol);
		DecimalFormat sixDecimals = new DecimalFormat("0.000000", symbol);
			
		System.out.println();
		System.out.println(twoDecimals.format(a) + " * " + twoDecimals.format(b) + " = " + twoDecimals.format(c));
		System.out.println(twoDecimals.format(a) + " * " + twoDecimals.format(b) + " = " + sixDecimals.format(c));
		
	}

}
