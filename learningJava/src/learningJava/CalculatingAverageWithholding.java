package learningJava;

import java.util.Scanner;

public class CalculatingAverageWithholding {

	public static void main(String[] args) {

	Scanner scnr = new Scanner (System.in);
	
	double userWeeklyIncome;
	
	double taxRate;
	
	double averageTaxWithholding;
	
	System.out.print ("Please input your weekly income to the nearest cent: $");
	
	userWeeklyIncome = scnr.nextFloat();
	
	if(userWeeklyIncome < 500) {
		
		taxRate = 0.10;
	}
	
	else if(userWeeklyIncome >= 500 && userWeeklyIncome < 1500) {
		
		taxRate = 0.15;
	}
	
	else if(userWeeklyIncome >= 1500 && userWeeklyIncome < 2500) {
		
		taxRate = 0.20;
	}
	
	else {
		
		taxRate = 0.30;
	}
	
	averageTaxWithholding = userWeeklyIncome * taxRate;
	
	System.out.println ("Your weekly average tax withholding to the nearest cent is $" + Math.round(averageTaxWithholding * 100.0) / 100.0);
	
	scnr.close();

	}

}
