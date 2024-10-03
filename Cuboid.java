//this program is about creating package and defining class in it
// This program defines a class in the threeDFigure package.
// This class includes methods to calculate the volume and surface area of a cuboid.
package threeDFigure;

import java.util.Scanner;

public class Cuboid {
	//member variables
	float length;
	float width;
	float height;
 
	// non-parameterized constructor
	public Cuboid() {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// Asking the user to input the length of the cube through keyboard
		System.out.println("Enter length of the of the cuboid :");
		length = sc.nextFloat();
		
		// Asking the user to input the width of the cube through keyboard
		System.out.println("Enter width of the of the cuboid :");
		width = sc.nextFloat();
		
		// Asking the user to input the height of the cube through keyboard
		System.out.println("Enter height of the of the cuboid :");
		height = sc.nextFloat();

		// Closing the scanner
		sc.close();
	}

	// creating method to display the data
	public void displayData() {
		System.out.println("----------------- CUBOID -----------------");
		System.out.println("Length  :" + length);
		System.out.println("Height :" + height);
		System.out.println("width :" + width);
	}

	// Method to calculate the volume of the cuboid
	public void calculateVolume() {
		float volume = length * width * height;
		System.out.println("Volume of the cuboid :" + volume);
	}

	// Method to calculate the surface area of the cuboid
	public void calculateSurfaceArea() {
		float surfaceArea = 2 * (length * width) + 2 * (width * height) + 2 * height * length;
		System.out.println("Volume of the cuboid :" + surfaceArea);
	}

}
