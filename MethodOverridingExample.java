package com.apjfsa;

/*------------Base class------------------*/
class TwoDFigure {
	public void description() {
		System.out.println("This is two dimensional figure");
	}

	public void area() {
		System.out.println("Area is defined as the region boundeed by the outer boundary od the two d figure");
	}
}

/*-------------------------------------------*/
/*-------------Derived class------------*/
class Rectangle3 extends TwoDFigure {
	float length;
	float breadth;

	// overriding the methods
	public void description() {
		System.out.println("Rectangle is 2D figure which has length and breadth");
	}

	public void area() {
		length = 5;
		breadth = 10;
		float area = length * breadth;
		System.out.println("------------Rectangle-----------");
		System.out.println("Length:" + length);
		System.out.println("Breadth:" + breadth);
		System.out.println("Area is:" + area);
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		// creating the object of derived class
		Rectangle3 rect = new Rectangle3();
		rect.description();
		rect.area();
	}

}
