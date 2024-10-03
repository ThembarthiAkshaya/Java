//this program is about creating package and defining class in it
// This program defines a class in the threeDFigure package.
// This class includes methods to calculate the volume and surface area of a cylinder.
package threeDFigure;

import java.util.Scanner;

public class Cylinder {
	// member variables
	float radius;
	float height;

	// non-parameterized constructor
	public Cylinder() {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// Asking the user to input the radius of the cube through keyboard
		System.out.println("Enter radius of the of the cylinder :");
		radius = sc.nextFloat();
		
		// Asking the user to input the height of the cylinder through keyboard
		System.out.println("Enter height of the of the cylinder :");
		height = sc.nextFloat();

		// Closing the scanner
		sc.close();
	}

	// creating method to display the data
	public void displayData() {
		System.out.println("----------------- CYLINDER -----------------");
		System.out.println("radius  :" + radius);
		System.out.println("Height :" + height);
	}

	// Method to calculate the surface area of the cylinder
	public void calculateVolume() {
		float volume = 3.14f * radius * radius * height;
		System.out.println("Volume of the cylinder :" + volume);
	}

	// Method to calculate the surface area of the cylinder
	public void calculateSurfaceArea() {
		float surfaceArea = (2 * 3.14f * radius * height) + (2 * 3.14f * radius * radius);
		System.out.println("Volume of the cylinder :" + surfaceArea);
	}
}

