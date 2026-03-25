package Week3;

import java.util.Arrays;
import java.util.Scanner;


public class ArraysCandidates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		
		
		System.out.print("Enter the number of candidates: ");
		int numCand = Integer.parseInt(input.nextLine());
		String[] name = new String[numCand];
		int[] numVotes = new int[numCand]; 
		
		for (int i = 0; i < numCand; i++) {
			System.out.print("Enter name: ");
			name[i] = input.nextLine();
			System.out.print("Enter " + name[i] + "'s votes: ");
			numVotes[i] = Integer.parseInt(input.nextLine());
			
		}
		
		//check for highest number of vote 
		int maxVotes = numVotes[0];
		for (int i = 1; i < numVotes.length; i++) {
			if (numVotes[i] > maxVotes) {
				maxVotes = numVotes[i];
			}
		}
		
		// count candidates with max votes
		int tieCount = 0;
		for (int i = 0; i < numVotes.length; i++) {
			if (numVotes[i] == maxVotes) {
				tieCount++;
			}
		}
		
		if (tieCount > 1) {
			System.out.println("It is a tie!");
			for (int i = 0; i < numVotes.length; i++) {
				if (numVotes[i] == maxVotes) {
					System.out.println(name[i] + " (" + maxVotes + " votes)");
				}
			}
		} else {
			int winnerIndex = 0;
			for (int i = 0; i < numVotes.length; i++) {
				if (numVotes[i] == maxVotes) {
					winnerIndex = i;
					break;
				}
			}
			System.out.println(name[winnerIndex] + " is the winner with " + maxVotes + " votes!");
		}
		

	}

}
