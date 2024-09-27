package com.apjfsa;

public class ParameterizedConstructor {
	public static void main(String args[]) {
		Circle1 obj = new Circle1(7.08f);
		obj.display();
		obj.calculatePerimeter();
		obj.calculateArea();
	}

}


class Circle1 {
	float radius;

	//parameterized constructor
	Circle1(float r) {
		radius = r;
	}

	// method to display radius
	public void display() {
		System.out.println("It's a circle");
		System.out.println("Radius: " + radius + "cm");
	}

	// method to calculate area
	public void calculateArea() {
		double area;
		area = 3.14 * radius * radius;
		System.out.println("Area:" + area + "sq.cm");
	}

	// method to calculate perimeter
	public void calculatePerimeter() {
		double perimeter;
		perimeter = 2 * 3.14 * radius;
		System.out.println("perimeter:" + perimeter + "cm");
	}
}
