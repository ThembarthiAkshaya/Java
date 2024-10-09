//Write a program to calculate area and perimeter of circle. Also use exception handling

package ExceptionHandling_topic;

import java.util.Scanner;

/*------------------------------------------------------*/
/*----------custom exception class for radius-----------*/
class RadiusException extends Exception{
	public RadiusException(String msg) {
		super(msg);
	}
}
/*------------------------------------------------------*/
/*-----------defining circle class---------*/
class Circle{
	//member variable
	float radius;
	/*----------constructor---------*/	
	public Circle(){
		
	/*--------scanner class object---------*/
	Scanner sc=new Scanner(System.in);
	
	//asking user to enter the radius of the circle through keyboard
	System.out.println("Enter radius of circle(in cm):");
	radius=sc.nextFloat();
	
	//closing scanner class
	sc.close();
	}
	
	//Method for displaying information
	public void displayInfo(){
		System.out.println("radius  :"+radius);
	}
	
	//Method for calculating the area 
	public void calucateArea() {
		try {
			//check whether the radius is valid and throw exception
			if(radius<0) {
				throw new RadiusException("Radius cannot be negative");
			}

			//calculate area if the radius is valid 
			else
			{
				//formula to calculate area
			float area=3.14f*radius*radius;
			System.out.println("Area :"+area);
			}
		}
		catch(RadiusException exception) {
			//handle exception by printing message
			System.out.println(exception);
		}
		
	}
	
	//Method for calculating perimeter
	public void calculatePerimeter() {
		try {
			//check whether the radius is valid and throw exception
			if(radius<0) {
				throw new RadiusException("Radius cannot be negative");
			}
			//calculate area if the radius is valid 
			else {
				//formulae to calculate perimeter
					float perimeter=2*3.14f*radius;
					System.out.println("Perimeter "+perimeter);
			}
		}
		catch(RadiusException exception) {
			//handle exception by printing message
			System.out.println(exception);
		}
	}
}
/*------------------------------------------------------*/
/*----------------initial class-----------------------*/
public class CircleOperation {

	public static void main(String[] args) {
		
		//creating object for circle class
		Circle circle=new Circle();
		
		//calling methods
		circle.displayInfo();
		circle.calucateArea();
		circle.calculatePerimeter();
		}
}

