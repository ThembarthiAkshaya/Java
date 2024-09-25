package com.apjfsa;

interface ThreedFigure {

	/*-----Method of curved surface area----*/
	void calculateCurvedSurfaceArea();

	/*-----Method of total surface area----*/
	void calculateTotalSurfaceArea();

	/*-----Method of volume----*/
	void calculateVolume();
}

class Cylinder implements ThreedFigure {

	// declaring variables to store radius and height
	float radius;
	float height;

	/*------constructor-------*/
	Cylinder(float radius, float height) {
		this.radius = radius;
		this.height = height;
	}

	/*---------Method to Display the radius and height of cylinder----------*/
	public void display() {
		System.out.println("---------Cylinder--------");
		System.out.println("Radius :" + radius);
		System.out.println("Height :" + height);
	}

	/*-----calculating the curved surface area of the cylinder-----*/
	public void calculateCurvedSurfaceArea() {
		float curvedsurfaceArea = 2 * 3.14f * radius * height;
		System.out.println("Curved Surface Area:" + curvedsurfaceArea);
	}

	/*-----calculating the total surface area of the cylinder -----*/
	public void calculateTotalSurfaceArea() {
		float totalsurfaceArea = 2 * 3.14f * radius * (radius + height);
		System.out.println("Total Surface Area:" + totalsurfaceArea);
	}

	/*-----calculating the volume of the cylinder-----*/
	public void calculateVolume() {
		float volume = 3.14f * radius * 2 * height;
		System.out.println("Volume:" + volume);
	}
}

public class InterfaceExample1 {
	
	public static void main(String[] args) {
		
		//Creating a cylinder object and displaying its properties
		Cylinder cylinder = new Cylinder(3.14f, 2.35f);
		cylinder.display();
		cylinder.calculateCurvedSurfaceArea();
		cylinder.calculateTotalSurfaceArea();
		cylinder.calculateVolume();
	}
}
