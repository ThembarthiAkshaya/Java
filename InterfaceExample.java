/*----Writing program on interface-----*/
package com.apjfsa;

/*-----Defining interface------*/
interface TwoDFigure {
	/*-----method for perimeter----*/
	void calculatePerimeter();

	/*-----method for area----*/
	void calculateArea();
}

/*-----Square class implementing TwoDFigure interface-----*/
class Square implements TwoDFigure {

	float side; // Variable to hold the length of the side of the square

	/*----------constructor---------*/
	Square(float side) {
		this.side = side; // Initialize side with the given value
	}

	/*---------Method to display the side of square----------*/
	public void display() {
		System.out.println("---------Square---------");
		System.out.println("Side:" + side + "cm");
	}

	/*-----Calculating the perimeter of the square-----*/
	public void calculatePerimeter() {
		float perimeter = 4 * side;
		System.out.println("Perimeter :" + perimeter + "cm");
	}

	/*-----Calculating the area of the square-----*/
	public void calculateArea() {
		float area = side * side;
		System.out.println("Area :" + area + "sq.cm");
	}
}

/*-----Rectangle6 class implementing TwoDFigure interface-----*/
class Rectangle6 implements TwoDFigure {

	float length, breadth; // Variables to hold length and breadth of the rectangle

	/*----------constructor---------*/
	Rectangle6(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	/*---------Method to display the dimensions of the rectangle----------*/
	public void display() {
		System.out.println("----------Rectangle-----------");
		System.out.println("Length :" + length + "cm");
		System.out.println("Breadth :" + breadth + "cm");
	}

	/*-----Calculating the perimeter of the rectangle-----*/
	public void calculatePerimeter() {
		float perimeter = 2 * (length * breadth);
		System.out.println("Perimeter :" + perimeter + "cm");
	}

	/*-----Calculating the area of the rectangle-----*/
	public void calculateArea() {
		float area = length * breadth;
		System.out.println("Area :" + area + "sq.cm");
	}
}

//Initial class
public class InterfaceExample {

	public static void main(String[] args) {

		// Creating a Square object and displaying its properties
		Square square = new Square(24.5f);
		square.display();
		square.calculatePerimeter();
		square.calculateArea();

		// Creating a Rectangle6 object and displaying its properties
		Rectangle6 rectangle = new Rectangle6(23.4f, 13.5f);
		rectangle.display();
		rectangle.calculatePerimeter();
		rectangle.calculateArea();
	}
}
