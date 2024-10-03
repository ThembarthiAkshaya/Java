//this program is about creating package and defining class in it
// This program defines a class in the threeDFigure package.
// This class includes methods to calculate the volume and surface area of a cube
package threeDFigure;

import java.util.Scanner;

public class Cube {
	// member variables
	float side;

	public Cube() {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// Asking the user to input the side of the cube through keyboard
		System.out.println("Enter side of the of the cube :");
		side = sc.nextFloat();

		// Closing the scanner
		sc.close();
	}

	// creating method to display the data
	public void displayData() {
		System.out.println("----------------- CUBE -----------------");
		System.out.println("Side  :" + side);
	}

	// Method to calculate the surface area of the cube
	public void calculateVolume() {
		float volume = side * side * side;
		System.out.println("Volume of the cube :" + volume);
	}

	// Method to calculate the surface area of the cube
	public void calculateSurfaceArea() {
		float surfaceArea = 6 * side * side;
		System.out.println("Volume of the cube :" + surfaceArea);
	}

}
