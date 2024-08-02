package com.apjfsa;

import java.util.Scanner;

/*--defining a class for rectangle  */
class Rectangle1 {
	// member variables
	private float length, breadth;
	// input through the keyboard

	public void inputSides()

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle(in cm):");
		length = sc.nextFloat();// accessing method
		System.out.println("Enter breadth of rectangle(in cm):");
		breadth = sc.nextFloat();// accessing method
	}

	// method to display data
	public void displaySides() {
		System.out.println("Length: " + length);
		System.out.println("Breadth: " +breadth);

	}

	// creating method to calculate perimeter
	public void calculatePerimeter() 
	{
		float p; // variable to store perimeter
		p = 2 * (length + breadth);
		System.out.println("perimeter : " + p + "cm");
	}

	public void calculateArea()
	{
		float a; // variable to store area
		a = length * breadth;
		System.out.println("area : " + a + "sq.cm");
	}
}

//initial class
public class RectangleOperation {

	public static void main(String[] args) {
		Rectangle1 recobj = new Rectangle1();
		recobj.inputSides();
		recobj.displaySides();
		recobj.calculatePerimeter();
		recobj.calculateArea();
	}

}
