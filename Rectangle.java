package com.apjfsa;
//importing Scanner class
import java.util.Scanner;

public class Rectangle {

	// creating a method for area with return type
	public static float area(float len, float wid) {
		return len * wid;
	}

	// creating a method for perimeter of a with return type
	public static float perimeter(float len, float bre) {
		float perimeter = 2 * (len + bre);
		return perimeter;
	}

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// declaring variables to store length,width
		float length, breadth;

		// taking input through the keyboard
		System.out.println("Enter length of the rectangle:");
		length = sc.nextFloat();

		/*--verifying the length is positive or not */
		if (length < 0)
			System.out.println("Unable to proceed with neative length");
		else
		{
			System.out.println("Enter width of the rectangle");
			breadth = sc.nextFloat();
			
			/*--verifying the length is positive or not */
			if (breadth < 0)
				System.out.println("Unable to proceed with neative breadth");
			
			else 
			{
				// calling method and storing it's value in a variable
				float area = area(length, breadth);
				float perimeter = perimeter(length, breadth);

				// Displaying area and perimeter
				System.out.println("Area of the rectangle is " + area);
				System.out.println("Perimeter of the rectangle is " + perimeter);
			}
		}
	}
}
