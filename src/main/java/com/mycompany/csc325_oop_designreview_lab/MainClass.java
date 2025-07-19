package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * MainClass tests the functionality of the Student, Freshman, and Senior classes.
 * It demonstrates object creation, user input, GPA setting, and string representation.
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error ✔️
		// ToDo 6: Fix the constructor of the Student class ✔️
	    // Todo 7: Create two classes for Freshman and Senior ✔️
	    // ToDo 8: The senior class should have a minimum of 85 credits ✔️
		// ToDo 9: Add a toString method for the Student class ✔️
		// ToDo 10: Add a toString method for the Freshman class ✔️

	 	// creating a Student object with name and age only (credits default to 0)
		Student std1= new Student("James", (short) 20);

		// ToDo 11: Add a toString method for the Senior class ✔️

	    // creating a Freshman student with name, age, and 12 credits
		Freshman std11 = new Freshman("James", (short) 20, 12); // name, age, credits

		 // creating a Senior student with name, age, and 90 credits
	 	Senior std2 = new Senior("John", (short) 30, 90);

		// ToDo 12: Set the gpa of the student using the scnr and user ✔️
		// 			input and then print the output.
	 	//create Scanner
	 	Scanner scnr = new Scanner(System.in);

	 	// prompt the user to enter the GPA for the Freshman student
	 	System.out.print("Enter GPA for " + std11.getName() + ": ");
	 	double gpa1 = scnr.nextDouble();
	 	std11.setGpa(gpa1);

	 	// prompt the user to enter the GPA for the Senior student
	 	System.out.print("Enter GPA for " + std2.getName() + ": ");
	    double gpa2 = scnr.nextDouble();
		std2.setGpa(gpa2);

		//close Scanner
	 	scnr.close();

		//output information about the students using toString
		System.out.println(std11);
		System.out.println(std2);

		// ToDo 13: add comments and explain your code ✔️

	}

}

