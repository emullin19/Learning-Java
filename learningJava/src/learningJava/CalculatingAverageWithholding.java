package learningJava;

import java.util.Scanner;

public class CalculatingAverageWithholding {

	public static void main(String[] args) {

	Scanner scnr = new Scanner (System.in);
	
	//Declaring the double variables userWeeklyIncome, taxRate, and averageTaxWithholding.
	double userWeeklyIncome;
	
	double taxRate;
	
	double averageTaxWithholding;
	
	//Prompt the user to input their weekly income to the nearest cent.
	System.out.print ("Please input your weekly income to the nearest cent: $");
	
	//Initializing userWeeklyIncome to the user's input. 
	userWeeklyIncome = scnr.nextDouble();
	
	//If the user's income is less than $500, initialize taxRate to 10%.
	if(userWeeklyIncome < 500) {
		
		taxRate = 0.10;
	}
	
	//If the user's income is greater than $500 and less than $1500, initialize taxRate to 15%.
	else if(userWeeklyIncome >= 500 && userWeeklyIncome < 1500) {
		
		taxRate = 0.15;
	}
	
	//If the user's income is less than $1500 and less than $2500, initialize taxRate to 20%.
	else if(userWeeklyIncome >= 1500 && userWeeklyIncome < 2500) {
		
		taxRate = 0.20;
	}
	
	//If the user's income is greater than $2500, initialize taxRate to 30%.
	else {
		
		taxRate = 0.30;
	}
	
	//Initialize averageTaxWithholding to the product of the user's weekly income and the applicable tax rate.
	averageTaxWithholding = userWeeklyIncome * taxRate;
	
	//Declaring the String averageTaxWithheld and using the format() method to round the average to two decimal places.
	String averageTaxWithheld = String.format("%.2f", averageTaxWithholding);
	
	//Print the user's weekly average tax withheld to the nearest cent.
	System.out.println ("Your weekly average tax withholding to the nearest cent is $" + averageTaxWithheld);
	
	scnr.close();

	}

}
