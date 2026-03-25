package Week3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class ArraysDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = Integer.parseInt(input.nextLine());
        
        if (n < 4) {
            System.out.println("Sorry, at least 4 values required");
            return;
        }
        
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            data[i] = Integer.parseInt(input.nextLine());
        }
        
        // Call library methods
        int minVal = ArraysLibrary.min(data);
        int maxVal = ArraysLibrary.max(data);
        double meanVal = ArraysLibrary.mean(data);
        double medianVal = ArraysLibrary.median(data);
        double stdDev = ArraysLibrary.standardDeviation(data);
        
        // Format output (comma decimals)
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("0.0", symbols);
        
        System.out.println("n = " + n);
        System.out.println("Min: " + minVal);
        System.out.println("Max: " + maxVal);
        System.out.println("Mean: " + df.format(meanVal));
        System.out.println("Median: " + df.format(medianVal));
        System.out.println("Sample standard deviation: " + df.format(stdDev));
        
        // Print sample data
//        System.out.print("Sample  ");
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i]);
//            if (i < data.length - 1) System.out.print(" ");
//        }
//        System.out.println();
    }
}
