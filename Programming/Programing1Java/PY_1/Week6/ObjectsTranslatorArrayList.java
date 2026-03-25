package Week6;

import java.util.ArrayList;
import java.util.Scanner;

import Week5.WordPair; 

public class ObjectsTranslatorArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WordPair> parit = new ArrayList<WordPair>();
		
		Scanner input = new Scanner(System.in);
		String engWord;
		
		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		
		do {
			System.out.print("Enter an English word: ");
			engWord = input.nextLine();
			
			if (!engWord.equalsIgnoreCase("ok")) {
				System.out.print("Enter a Finnish word: ");
				String finWord = input.nextLine();
				parit.add(new WordPair(engWord, finWord));
			}
			
		} while (!engWord.equalsIgnoreCase("ok"));
		
		System.out.println();
		System.out.println("=== Creating an English-Finnish service (quit ends) ===");
		
		do {
			System.out.print("Enter an English word: ");
			engWord = input.nextLine();
			
			if (!engWord.equalsIgnoreCase("quit")) {
				boolean found = false;
				
				for (int i = 0; i < parit.size(); i++) {
					if (parit.get(i).getEnglishWord().equalsIgnoreCase(engWord)) {
						System.out.println(parit.get(i).getFinnishWord());
						found = true;
						break;
					} 
				
				}
				if (!found) {
					System.out.println("Unknown word");
				
				}
			} 
		} while (!engWord.equalsIgnoreCase("quit"));

	}

}
