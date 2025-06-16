package learningJava;

import java.util.Scanner;

public class MonthlyTemperatures {

	public static void main(String[] args) {
		
		String [] monthName = {"January", "February", "March", "April", "May", "June",
					"July", "August", "September", "October", "November", "December"};
	
		double [] monthlyAverageTemperatures = {29.9, 38.7, 42.0, 50.2, 56.3, 71.5, 72.6, 71.9, 66.4, 57.2, 37.6, 37.8};
		
		Scanner scnr = new Scanner (System.in);
		
		String userChoice;
		
		int i;
		
		int highestMonthIndex = 0;
		
		int lowestMonthIndex = 0;
		
		int monthNameIndex = -1;
		
		double monthlyTemperatureSum = 0;
		
		double yearlyAverageTemperature = 0;
		
		double highestMonthlyTemperature;
		
		double lowestMonthlyTemperature;
		
		System.out.print ("Please input a month (or 'year' to see yearly data): ");
		
		userChoice = scnr.nextLine();
		
		if (userChoice.equalsIgnoreCase("year")) {
			
			for (double temperatures : monthlyAverageTemperatures) {
				
				monthlyTemperatureSum = monthlyTemperatureSum + temperatures;
			}
			
			yearlyAverageTemperature = monthlyTemperatureSum / 12;
		
			highestMonthlyTemperature = monthlyAverageTemperatures[0];
		
			lowestMonthlyTemperature = monthlyAverageTemperatures[0];
		
			for(i = 1; i < monthlyAverageTemperatures.length; i++) {
			
				if (monthlyAverageTemperatures[i] > highestMonthlyTemperature) {
				
					highestMonthlyTemperature = monthlyAverageTemperatures[i];
				
					highestMonthIndex = i;
				}
			
				if (monthlyAverageTemperatures[i] < lowestMonthlyTemperature) {
				
					lowestMonthlyTemperature = monthlyAverageTemperatures[i];
				
					lowestMonthIndex = i;
				}
				
			}	
		
			for(i = 0; i < 12; i++) {
				
				System.out.println ("\n" + monthName[i] + ": " + monthlyAverageTemperatures[i] + "°F");
			}
			
			System.out.println ("\n\n2024 Yearly Average Temperature: " + String.format("%.2f", yearlyAverageTemperature) + "°F");
		
			System.out.println ("Highest Monthly Temperature: " + monthlyAverageTemperatures[highestMonthIndex] + "°F in " + monthName[highestMonthIndex]);
		
			System.out.println ("Lowest Monthly Temperature: " + monthlyAverageTemperatures[lowestMonthIndex] + "°F in " + monthName[lowestMonthIndex]);
			
		}
		
		else {
		
			for(i = 0; i < monthName.length; i++) {
				
				if (userChoice.equalsIgnoreCase(monthName[i])) {
					
					monthNameIndex = i;
					
					break;
				}
			}
			
			if(monthNameIndex != -1) {
				
				System.out.print ("\n\n" + monthName[monthNameIndex] + " Average Monthly Temperature: " + monthlyAverageTemperatures[monthNameIndex] + "°F");
			
			}
			
			else {
				
				System.out.print ("Invalid month.");

			}

		}
		
		scnr.close();

	}

}
