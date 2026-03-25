package Week6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectsCityNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cities = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String cityName;
		// in case of not using import java.util.Scanner, we use
		// java.util.Scanner input = new java.util.Scanner(System.in);
		
		// do { } while: execute first, then check => always run 1+ times
		
		do {
			System.out.print("Enter city name: ");
			cityName = input.nextLine();
			
			if (!cityName.equalsIgnoreCase("quit")) {
				cities.add(cityName);
			}
			
		} while (!cityName.equalsIgnoreCase("quit"));
		
		//sort ArrayList
		Collections.sort(cities);
		
		//line break
		System.out.println();
		//print list
		for (String city : cities) {
			System.out.println(city.toUpperCase());
		}
		

	}

}
