//this program is about creating package and defining class in it
// This program defines a class in the twoDFigure package.
// This class includes methods to calculate the perimeter and area of a triangle.
package twoDFigure;

import java.util.Scanner;


public class Triangle {
	// member variables declaration
	float side1;
	float side2;
	float side3;
	float base;
	float height;

	// non-parameterized constructor
	public Triangle() {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// Asking the user to enter the base,height and sides of the rectangle through
		// keyboard
		System.out.print("Enter base of the base :");
		base= sc.nextFloat();
		System.out.print("Enter height of the triangle :");
		height = sc.nextFloat();
		System.out.print("Enter first side of the triangle :");
		side1= sc.nextFloat();
		System.out.print("Enter second side of the triangle :");
		side2= sc.nextFloat();
		System.out.print("Enter third side of the triangle :");
		side3= sc.nextFloat();
		
		//closing the scanner
		sc.close();
	}

	//Method for displaying data
	public void display() {
		System.out.println("---------------- TRIANGLE ---------------");
		System.out.println("Base :"+base);
		System.out.println("Height   :"+height);
		System.out.println("first side :"+side1);
		System.out.println("second side  :"+side2);
		System.out.println("third side:"+side3);
	}

	//Method for calculating perimeter
	public void calculatePerimeter(){
		float perimeter =side1+side2+side3;  //formula for perimeter
		System.out.println("Perimeter of the triangle :" + perimeter);
	}

	//Method for calculating area
	public void calculateArea() {
		float area =(1/2)*(base*height);  //formula for area
		System.out.println("Perimeter of the triangle :" + area);
	}
}
