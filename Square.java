//this program is about creating package and defining class in it
// This program defines a class in the twoDFigure package.
// This class includes methods to calculate the perimeter and area of a square.
package twoDFigure;

import java.util.Scanner;

public class Square {
	//member variable declaration
	float side;

	//non-parameterized constructor
	public Square() {
		//creating object of scanner class
		Scanner sc=new Scanner(System.in);

		//asking the user to input the side through the keyboard
		System.out.println("Enter the side of the square :");
		side=sc.nextFloat();
		
		//closing the scanner
		sc.close();
	}

	//creating method to display the data
	public void displayData() {
		System.out.println("----------SQUARE--------");
		System.out.println("Side :"+side);
	}

	//creating method for calculating perimeter
	public void calculatePerimeter() {
		float perimeter=4*side;  //formula for perimeter
		System.out.println("Perimeter of the square :"+perimeter);
	}
		//creating method for calculating area
		public void calculateArea() {
			float area=side*side;  //formula for area
			System.out.println("Area of the square :"+area);
	
	}


}
