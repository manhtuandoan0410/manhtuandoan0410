package Week5;

import java.util.Scanner;

public class ObjectsCertificationProgram {
    public static void main(String[] args) {
        Coach[] coaches = new Coach[4];
        
        // ✅ FIX 2: FULLY QUALIFIED Scanner (no import issues)
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Input 4 coaches
        for (int i = 0; i < coaches.length; i++) {
            System.out.print("Enter coach name: ");
            String name = input.nextLine();
            
            System.out.print("Enter " + name + "'s score: ");
            int score = Integer.parseInt(input.nextLine());
            
            coaches[i] = new Coach(name, score);
        }
        
        System.out.print("Enter the minimum passing score: ");
        int passingScore = Integer.parseInt(input.nextLine());
        
        // Count PASSING coaches
        int passingCount = 0;
        for (int i = 0; i < coaches.length; i++) {
            if (coaches[i].getScore() >= passingScore) {
                passingCount++;
            }
        }
        
        // Print using GETTERS only
        System.out.println();
        System.out.println("Passing scores");
        
        for (int i = 0; i < coaches.length; i++) {
            if (coaches[i].getScore() >= passingScore) {
                System.out.println(coaches[i].getName() + " (" + 
                                 coaches[i].getScore() + " points)");
            }
        }
        
        double passingRate = (double) passingCount / coaches.length * 100;
        System.out.println("The passing rate is " + passingRate + " %");
    }
}
