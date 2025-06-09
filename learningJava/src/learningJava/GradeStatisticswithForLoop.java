package learningJava;

import java.util.Scanner;

public class GradeStatisticswithForLoop {

	public static void main(String[] args) {

	Scanner scnr = new Scanner (System.in);
	
	float classGrade;
	
	float gradesTotal = 0;
	
	float maximumGrade = 0;
	
	float minimumGrade = 100;
	
	int i;
	
	for(i = 1; i <= 10; i++) {
		
		System.out.print ("Please enter a grade: ");
		
		classGrade = scnr.nextFloat();
		
		gradesTotal = gradesTotal + classGrade;
		
		if(classGrade > maximumGrade) {
			
			maximumGrade = classGrade;
			
		}
		
		if(classGrade < minimumGrade) {
			
			minimumGrade = classGrade;
			
		}
		
		if (classGrade > 100 || classGrade < 0) {
			
			System.out.print ("\nInvalid input. Please enter a valid grade: ");
		}
		
	}
	
	System.out.println ("\nAverage Class Grade: " + (gradesTotal / 10));
	
	System.out.println ("Maximum Class Grade: " + maximumGrade);
	
	System.out.println ("Minimum Class Grade: " + minimumGrade);
	
	scnr.close();

	}

}
