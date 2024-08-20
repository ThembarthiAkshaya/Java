//program to calculate area of rectangle,triangle,square and circle
package com.apjfsa;

class AreaCalculator {
	/*----Method to calculate area of rectangle---*/
	public void calculateArea(int length, int width) {
		int area = length * width;
		System.out.println("----------rectangle-------------");
		System.out.println("length=" + length + "cm");
		System.out.println("width=" + width + "cm");

		System.out.println("Area=" + area + "cm");
	}

	/*----Method to calculate area of triangle---*/
	public void calculateArea(float base, float height) {
		float area = 0.5f * (base * height);
		System.out.println("----------triangle-------------");
		System.out.println("length=" + base + "cm");
		System.out.println("width=" + height + "cm");
		System.out.println("Area=" + area + "square units");
	}

	/*----Method to calculate area of square---*/
	public void calculateArea(int side) {
		int area = side * side;
		System.out.println("------------square--------");
		System.out.println("side=" + side + "cm");
		System.out.println("Area=" + area);
	}

	/*----Method to calculate area of circle---*/
	public void calculateArea(float radius) {
		float area = 3.14f * radius * radius;
		System.out.println("------------circle--------");
		System.out.println("radius=" + radius + "cm");
		System.out.println("Area=" + area);
	}
}
//initial class
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		AreaCalculator ac = new AreaCalculator();
		ac.calculateArea(3.4f, 2.3f); // triangle
		ac.calculateArea(8, 9); // rectangle
		ac.calculateArea(4);   // square
		ac.calculateArea(4f);  // circle
	}

}
