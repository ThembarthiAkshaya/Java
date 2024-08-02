package com.apjfsa;

import java.util.Scanner;

class Circle {
	private float radius;

	// input through the keyboard
	public void inputRadius() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		radius=sc.nextFloat();
	}

	// method to display data
	public void displayRadius() {
		System.out.println("Radius: " + radius);
	}

	// creating method to calculate perimeter
	public void calculatePerimeter() {
		double p;
		p = 2 * 3.14 * radius;
		System.out.println("perimeter : " + p + "cm");

	}

	public void calculateArea() {
		double a;
		a = 3.14 * radius * radius;
		System.out.println("Area : " + a + "cm");
	}
}

//initial class
public class CircleOperation {

	public static void main(String[] args) {
		Circle cirobj = new Circle();
		cirobj.inputRadius();
		cirobj.displayRadius();
		cirobj.calculatePerimeter();
		cirobj.calculateArea();
	}

}
