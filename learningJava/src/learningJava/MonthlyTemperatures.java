package learningJava;

import java.util.Scanner;

public class MonthlyTemperatures {

	public static void main(String[] args) {
		
		//Declaring the array monthName and initializing it with the names of the twelve months.
		String [] monthName = {"January", "February", "March", "April", "May", "June",
					"July", "August", "September", "October", "November", "December"};
	
		//Declaring the array monthlyAverageTemperatures and initializing it with the average temperature for each month
		//in 2024 from www.weather.gov.
		double [] monthlyAverageTemperatures = {29.9, 38.7, 42.0, 50.2, 56.3, 71.5, 72.6, 71.9, 66.4, 57.2, 37.6, 37.8};
		
		Scanner scnr = new Scanner (System.in);
		
		//Declaring the string userChoice;
		String userChoice;
		
		//Declaring and initializing counter variables.
		int i;
		
		int highestMonthIndex = 0;
		
		int lowestMonthIndex = 0;
		
		//Since arrays start at index 0, initializing monthNameIndex to -1.
		int monthNameIndex = -1;
		
		//Declaring two doubles monthlyTemperatureSum and yearlyAverageTemperature and initializing them to 0.
		double monthlyTemperatureSum = 0;
		
		double yearlyAverageTemperature = 0;
		
		//Declaring two doubles for the highest and lowest monthly temperature.
		double highestMonthlyTemperature;
		
		double lowestMonthlyTemperature;
		
		//Prompting the user to enter a month or "year" to view yearly data.
		System.out.print ("Please input a month (or 'year' to see yearly data): ");
		
		//Initializing userChoice to the user's input.
		userChoice = scnr.nextLine();
		
		//If the user inputs "year" or "Year", enter the if block of code.
		if (userChoice.equalsIgnoreCase("year")) {
			
			//Using a for each loop to calculate the sum of the twelve monthly average temperatures.
			for (double temperatures : monthlyAverageTemperatures) {
				
				monthlyTemperatureSum = monthlyTemperatureSum + temperatures;
			}
			
			//Setting the yearly average temp to the sum of the monthly temps divided by 12.
			yearlyAverageTemperature = monthlyTemperatureSum / 12;
		
			//Initializing the highest and lowest monthly temps to the first value in the monthlyAverageTemperatures array.
			highestMonthlyTemperature = monthlyAverageTemperatures[0];
		
			lowestMonthlyTemperature = monthlyAverageTemperatures[0];
		
			for(i = 1; i < monthlyAverageTemperatures.length; i++) {
			
				//If the temp at index i is greater than the highest monthly temp,
				//initializing the highest monthly temp to that value and setting the highestMonthIndex equal to i.
				if (monthlyAverageTemperatures[i] > highestMonthlyTemperature) {
				
					highestMonthlyTemperature = monthlyAverageTemperatures[i];
				
					highestMonthIndex = i;
				}
				
				//If the temp at index i is less than the lowest monthly temp, 
				//initializing the lowest monthly temp to that value and setting the lowestMonthIndex equal to i.
				if (monthlyAverageTemperatures[i] < lowestMonthlyTemperature) {
				
					lowestMonthlyTemperature = monthlyAverageTemperatures[i];
				
					lowestMonthIndex = i;
				}
				
			}	
		
			//Outputting the monthly average temps for each month. 
			for(i = 0; i < 12; i++) {
				
				System.out.println ("\n" + monthName[i] + ": " + monthlyAverageTemperatures[i] + "°F");
			}
			
			//Outputting the yearly average, highest monthly temp, and lowest monthly temp.
			System.out.println ("\n\n2024 Yearly Average Temperature: " + String.format("%.2f", yearlyAverageTemperature) + "°F");
		
			System.out.println ("Highest Monthly Temperature: " + monthlyAverageTemperatures[highestMonthIndex] + "°F in " + monthName[highestMonthIndex]);
		
			System.out.println ("Lowest Monthly Temperature: " + monthlyAverageTemperatures[lowestMonthIndex] + "°F in " + monthName[lowestMonthIndex]);
			
		}
		
		//If the user's input does not equal "year" or "Year", enter the else block of code.
		else {
		
			//Since monthName is a String array, using a for loop to equate each monthName to an index number
			//and breaking out of the if statement when the user's input matches a month name.
			for(i = 0; i < monthName.length; i++) {
				
				if (userChoice.equalsIgnoreCase(monthName[i])) {
					
					monthNameIndex = i;
					
					break;
				}
			}
			
			//The value of monthNameIndex will remain a -1 if the user's input does not match a month name.
			//If it matched a month name, output the average monthly temp for that month.
			if(monthNameIndex != -1) {
				
				System.out.print ("\n\n" + monthName[monthNameIndex] + " Average Monthly Temperature: " + monthlyAverageTemperatures[monthNameIndex] + "°F");
			
			}
			
			//If the value of monthNameIndex is still a -1, let the user know the input was not valid.
			else {
				
				System.out.print ("Invalid month.");

			}

		}
		
		scnr.close();

	}

}
