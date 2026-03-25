package Week3;

import java.util.Scanner;

public class ArraysTranslation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] engWords = {"bus", "car", "cab", "house", "moon", "sun", "thanks", "train", "teacher"};
		String[] suomen = {"bussi", "auto", "taksi", "talo", "kuu", "aurinko", "kiitos", "juna","opettaja"};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an English word: ");
		String word = input.nextLine();
		
		String translatedWord = "Unknown word";
		
		for (int i = 0; i < engWords.length; i++) {
			if (word.equals(engWords[i])) {
				translatedWord = suomen[i];
				break;
			} 
		}
		
				
		System.out.println(translatedWord);
		
	}

}
