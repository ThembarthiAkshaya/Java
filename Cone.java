package threeDFigure;

import java.util.Scanner;

public class Cone {
	// member variables
	float radius;
	float height;

	// non-parameterized constructor
	public Cone() {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// Asking the user to input the side of the cube through keyboard
		System.out.println("Enter radius of the of the cone :");
		radius = sc.nextFloat();
		System.out.println("Enter height of the of the cone :");
		height = sc.nextFloat();

		// Closing the scanner
		sc.close();
	}

	// creating method to display the data
	public void displayData() {
		System.out.println("----------------- CONE -----------------");
		System.out.println("radius  :" + radius);
		System.out.println("Height :" + height);
	}

	// creating method for calculating the volume of the cone
	public void calculateVolume() {
		float volume = 1 / 3 * 3.14f * radius * radius * height;
		System.out.println("Volume of the cone :" + volume);
	}

	// creating method for calculating the surface area of the cone
	public void calculateSurfaceArea() {
		float surfaceArea = 3.14f * radius * (radius + height);
		System.out.println("Volume of the cone :" + surfaceArea);
	}
}
