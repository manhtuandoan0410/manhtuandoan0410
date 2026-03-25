package Week3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class ArraysLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize the grades array
		String[] grades = {"A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "A", "C", "C", "C"};
		
		//getting input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter letter: ");
		String grade = input.nextLine();
		
		int numOfGrade = 0;
		
		for (int i = 0; i < grades.length; i++) {
			if (grade.equals(grades[i])) {
				numOfGrade++;
			}
		}
		
		DecimalFormatSymbols symbol = new DecimalFormatSymbols();
		symbol.setDecimalSeparator(',');
		DecimalFormat twoDecimals = new DecimalFormat("0.00", symbol);
		
		double appearance = (numOfGrade * 100.0)/ grades.length;
		
		
		System.out.println(twoDecimals.format(appearance) + "%");
			
		
	}

}
