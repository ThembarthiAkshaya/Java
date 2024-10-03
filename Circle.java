//this program is about creating package and defining class in it
// This program defines a class in the twoDFigure package.
// This class includes methods to calculate the perimeter and area of a circle.
package twoDFigure;

import java.util.Scanner;

public class Circle {
	//member variable declaration
		float radius;

		//non-parameterized constructor
		public Circle() {
			//creating object of scanner class
			Scanner sc=new Scanner(System.in);

			//asking the user to input the side through the keyboard
			System.out.println("Enter the radius of the circle :");
			radius=sc.nextFloat();
			
			//closing the scanner
			sc.close();
		}

		//method to display the data
		public void displayData() {
			System.out.println("-------------- CIRCLE ------------");
			System.out.println("Radius :"+radius);
		}

		//method for calculating perimeter
		public void calculatePerimeter() {
			float perimeter=3.14f*radius*radius;  //formula for perimeter
			System.out.println("Perimeter of the circle :"+perimeter);
		}
			//method for calculating area
			public void calculateArea() {
				float area=2*3.14f*radius;  //formula for area
				System.out.println("Perimeter of the circle :"+area);
		
		}
}
