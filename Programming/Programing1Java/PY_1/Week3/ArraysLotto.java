package Week3;

import java.util.Arrays;
import java.util.Random;

public class ArraysLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGenerator = new Random();
		int[] lotto = new int[7];
		int count = 0;
		
		while (count < 7) {
			int x = randomGenerator.nextInt(39) + 1;
						
			boolean alreadyExisted = false;
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[j] == x) {
					alreadyExisted = true; 
					break;
				}
			}
			
			if (!alreadyExisted) {
				lotto[count] = x;
				count++;
			}
		}
		
		Arrays.sort(lotto);
		
		for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
		
	}

}


//package Week3;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class ArraysLotto {
//    public static void main(String[] args) {
//        Random randomGenerator = new Random();
//        int[] lotto = new int[7];
//        int count = 0;  // ← Track HOW MANY numbers added
//        
//        while (count < 7) {  // Keep going until 7 unique numbers
//            int x = randomGenerator.nextInt(39) + 1;
//            
//            boolean alreadyExisted = false;
//            for (int j = 0; j < lotto.length; j++) {
//                if (lotto[j] == x) {
//                    alreadyExisted = true;
//                    break;
//                }
//            }
//            
//            if (!alreadyExisted) {
//                lotto[count] = x;  // Use count, not i
//                count++;           // Next position
//            }
//            // No break - keep generating until 7 unique!
//        }
//        
//        Arrays.sort(lotto);
//        
//        for (int i = 0; i < lotto.length; i++) {
//            System.out.print(lotto[i] + " ");
//        }
//        System.out.println();
//    }
//}
