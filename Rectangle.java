//this program is about creating package and defining class in it
// This program defines a class in the twoDFigure package.
// This class includes methods to calculate the perimeter and area of a rectangle.
package twoDFigure;

import java.util.Scanner;

public class Rectangle {

	// member variables declaration
	float width;
	float length;

	// non-parameterized constructor
	public Rectangle() {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// Asking the user to enter the length and width of the rectangle through
		// keyboard
		System.out.print("Enter length of the rectangle :");
		length = sc.nextFloat();
		System.out.print("Enter width of the rectangle :");
		width = sc.nextFloat();

		//closing the scanner
		sc.close();
	}

	//Method for displaying data
	public void display() {

		System.out.println("---------- RECTANGLE --------");
		System.out.println("length  :"+length);
		System.out.println("width   :"+width);
	}

	//Method for calculating perimeter
	public void calculatePerimeter() {
		float perimeter = 2 * (length + width);  //formula for perimeter
		System.out.println("Perimeter of the rectangle :" + perimeter);
	}

	//Method for calculating area
	public void calculateArea() {
		float area = length * width; //formula for area
		System.out.println("Perimeter of the rectangle :" + area);
	}
}
