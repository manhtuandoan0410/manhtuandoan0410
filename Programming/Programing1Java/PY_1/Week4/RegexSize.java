package Week4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] sizes = {"XXS", "XS", "S", "M", "L", "XL", "XXL"};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size: ");
		String str = input.nextLine().trim().toUpperCase();
		
		//Single RegEx for all valid sizes
		if (Pattern.matches("^(XXS|XS|S|M|L|XL|XXL)$", str)) {
            System.out.println("Size ok");
        } else {
            System.out.println("Invalid size");
        }
					
	}

}
