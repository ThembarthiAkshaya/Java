//this program is about creating package and defining class in it
// This program defines a class in the threeDFigure package.
// This class includes methods to calculate the volume and surface area of a sphere.
package threeDFigure;

import java.util.Scanner;

public class Sphere {
	// member variables
		float radius;

		public Sphere() {
			// creating object for scanner class
			Scanner sc = new Scanner(System.in);

			// Asking the user to input the radius of the sphere through keyboard
			System.out.println("Enter radius of the of the sphere :");
			radius = sc.nextFloat();

			// Closing the scanner
			sc.close();
		}

		//Method to display the data
		public void displayData() {
			System.out.println("----------------- SPHERE -----------------");
			System.out.println("radius  :" + radius);
		}

		// Method to calculate the volume of the sphere
		public void calculateVolume() {
			float volume = 4/3*(3.14f*radius*radius*radius);
		  System.out.println("Volume of the sphere :" + volume);
		}

		// Method to calculate the surface area of the sphere
		public void calculateSurfaceArea() {
			float surfaceArea=4*3.14f*radius*radius;
			System.out.println("Volume of the sphere :" + surfaceArea);
		}

	}

