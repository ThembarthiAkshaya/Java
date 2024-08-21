package com.apjfsa;

//Base class representing a general shape
class Shape {
	// Fields to store color and whether the shape is filled
	String color;
	Boolean filled;

	// Parameterized constructor to initialize color and filled status
	Shape(String color, Boolean filled) {
		this.color = color;
		this.filled = filled;
	}
}

//Subclass representing a circle
class Circle extends Shape {
	

	// Parameterized constructor to initialize color, filled status
	Circle(String color, Boolean filled, int radius) {
		super(color, filled);
		
	}

	// Method to display details of the circle
	void displayDetails() {
		System.out.println("Color:" + color);
		System.out.println("Filled:" + filled);
		
	}

	// Method to calculate the area of the circle
	public void calculateArea(int radius) {
        System.out.println("Radius: " + radius); // Print the radius
		float area = 3.14f * radius * radius;
		System.out.println("Area of the circle is:" + area);
	}
}

//Subclass representing a rectangle
class Rectangle extends Shape {
	
	// Parameterized constructor to initialize color, filled status
	
	Rectangle(String color, Boolean filled, int length, int breadth) {
		super(color, filled); // Call the constructor of the base class
		
	}

	// Method to display details of the rectangle
	void dispalyDetails() {
		System.out.println("Color:" + color); // Print the color of the rectangle
		System.out.println("Filled:" + filled); // Print the filled status of the rectangle
		
	}

	// Method to calculate the area of the rectangle
	public void calculateArea(int length,int breadth) {
		 System.out.println("Length: " + length); // Print the length of the rectangle
	     System.out.println("Breadth: " + breadth); // Print the breadth of the rectangle
		float area = length * breadth; // Area of a rectangle = length * breadth
		System.out.println("Area of the rectangle is:" + area);
	}
}

public class InheritanceOfShape {

	public static void main(String[] args) {
		// Create an instance of Rectangle
		Rectangle rect = new Rectangle("Red", true, 12, 13);

		// Display details of the rectangle
		rect.dispalyDetails();

		// Calculate and display the area of the rectangle
		rect.calculateArea(12,13);
	}
}
