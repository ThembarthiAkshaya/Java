//MethodOverloading by changing data type of the parameter,no of parameter and order of parameter.
/*create a class to calculate volume of cube and sphere */

package com.apjfsa;

//defining a class for volume calculation
class VolumeCalculator {

	/*----Method to calculate volume of a cube---*/
	public void calculateVolume(int side) {
		float volume = side * side * side;
		System.out.println("----------cube-------------");
		System.out.println("side=" + side + "cm");
		System.out.println("Volume=" + volume + "cubic cm");
	}

	/*----Method to calculate volume of a sphere---*/
	public void calculateVolume(float radius) {
		float volume = (4 * 3.14f * radius * radius * radius) / 3;
		System.out.println("----------sphere-------------");
		System.out.println("radius=" + radius + "cm");
		System.out.println("Volume=" + volume + "cubic cm");
	}

	/*----Method to calculate volume of a cuboid---*/
	public void calculateVolume(float length, float breadth, float height) {
		float volume = length * breadth * height;
		System.out.println("----------cuboid-------------");
		System.out.println("length=" + length + "cm");
		System.out.println("breadth=" + breadth + "cm");
		System.out.println("height=" + height + "cm");
		System.out.println("Volume=" + volume + "cubic cm");
	}

	/*----Method to calculate volume of a cylinder---*/
	public void calculateVolume(int radius, float height) {
		float volume = 3.14f * radius * radius * height;
		System.out.println("----------cylinder-------------");
		System.out.println("length=" + radius + "cm");
		System.out.println("height=" + height + "cm");
		System.out.println("Volume=" + volume + " cubic cm");
	}
}
//initial class
public class MethodOverloadingExample {
	public static void main(String args[]) {
		VolumeCalculator vc = new VolumeCalculator();
		vc.calculateVolume(7.0f);  //sphere
		vc.calculateVolume(10);    //cube
		vc.calculateVolume(12f, 13f, 12f);   //cuboid
		vc.calculateVolume(5, 6.8f);  //cylinder
	}
}