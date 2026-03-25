import java.util.Random;
import java.util.Arrays;

public class ArraysLotto {
    public static void main(String[] args) {
        // Create exactly one random generator
        Random randomGenerator = new Random();

        // Array to store 7 lotto numbers
        int[] lotto = new int[7];

        // Fill the array with unique random numbers between 1 and 39
        for (int i = 0; i < lotto.length; i++) {
            int candidate;

            while (true) {
                // Generate a candidate number in range 1..39
                candidate = randomGenerator.nextInt(39) + 1;

                // Check if this candidate already exists in lotto[0..i-1]
                boolean alreadyExists = false;
                for (int j = 0; j < i; j++) {
                    if (lotto[j] == candidate) {
                        alreadyExists = true;
                        break;
                    }
                }

                // If it does not exist, accept it and break the while loop
                if (!alreadyExists) {
                    lotto[i] = candidate;
                    break;
                }
                // else: loop continues, generate a new candidate
            }
        }

        // Sort the numbers in ascending order
        Arrays.sort(lotto);

        // Print the lotto numbers
        System.out.print("Lotto numbers: ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
    }
}
