package basicCalculations;

//import java.util.Scanner;
//import java.math.BigDecimal;
//import java.text.DecimalFormat;
//import java.text.DecimalFormatSymbols;
//
//public class MultiplicationProgram {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		DecimalFormatSymbols symbol = new DecimalFormatSymbols();
//		symbol.setDecimalSeparator('.');
//		DecimalFormat freeFormat = new DecimalFormat("0.000000000000000000", symbol);
//		
//		System.out.print("Enter x: ");
//		BigDecimal x = new BigDecimal(input.nextLine().trim().replace(',', '.'));
//		
//		System.out.print("Enter y: ");
//		BigDecimal y = new BigDecimal(input.nextLine().trim().replace(',', '.'));
//		
//		BigDecimal product = x.multiply(y);
//		
//		String result = x + " * " + y + " = " + freeFormat.format(product);
//		
//		System.out.println();
//		System.out.println(result);
//					
//	}
//
//}

import java.util.Scanner;
import java.math.BigDecimal;

public class MultiplicationProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        String rawX = input.nextLine().trim();

        System.out.print("Enter y: ");
        String rawY = input.nextLine().trim();

        // Normalize to dot for internal use
        String normX = rawX.replace(',', '.');
        String normY = rawY.replace(',', '.');

        BigDecimal x = new BigDecimal(normX);
        BigDecimal y = new BigDecimal(normY);

        BigDecimal product = x.multiply(y);

        System.out.println();
        System.out.println(normX + " * " + normY + " = " + product.toPlainString());
    }
}
