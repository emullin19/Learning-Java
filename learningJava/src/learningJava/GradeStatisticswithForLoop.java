package learningJava;

import java.util.Scanner;

public class GradeStatisticswithForLoop {

	public static void main(String[] args) {

	Scanner scnr = new Scanner (System.in);
	
	//Declaring the float variables classGrade, gradesTotal, maximumGrade, and minimumGrade.
	float classGrade;
	
	//Initializing gradesTotal and maximumGrade to 0 and minimumGrade to 100.
	float gradesTotal = 0;
	
	float maximumGrade = 0;
	
	float minimumGrade = 100;
	
	//Declaring the int variable i.
	int i;
	
	//Initialize i to 1, increment i by 1 each iteration, and execute the loop until i is less than or equal to 10.
	for(i = 1; i <= 10; i++) {
		
		//Prompting the user for a class grade.
		System.out.print ("Please enter a grade: ");
		
		//Initializing classGrade to the user's input.
		classGrade = scnr.nextFloat();
		
		//Initializing gradesTotal to sum of the current total and the user's current input.
		gradesTotal = gradesTotal + classGrade;
		
		//If the class grade is greater than the maximum grade, set maximumGrade equal to that value.
		if(classGrade > maximumGrade && classGrade <= 100) {
			
			maximumGrade = classGrade;
			
		}
		
		//If the class grade is less than the minimum grade, set minimumGrade equal to that value.
		if(classGrade < minimumGrade && classGrade >= 0) {
			
			minimumGrade = classGrade;
			
		}
		
		//If the user's input is greater than 100 or less than 0, ask the user to input a valid grade.
		if (classGrade > 100 || classGrade < 0) {
			
			System.out.print ("\nInvalid input. Please enter a valid grade: ");
		}
		
	}
	
	//Using the format() method to round all output to two decimal places.
	String averageClassGrade = String.format("%.2f", (gradesTotal / 10));
	
	String maximumClassGrade = String.format("%.2f", maximumGrade);
	
	String minimumClassGrade = String.format("%.2f", minimumGrade);
	
	//Outputting the average, maximum, and minimum grades.
	System.out.println ("\nAverage Class Grade: " + averageClassGrade);
	
	System.out.println ("Maximum Class Grade: " + maximumClassGrade);
	
	System.out.println ("Minimum Class Grade: " + minimumClassGrade);
	
	scnr.close();

	}

}
