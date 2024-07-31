//program on finding the amount to be paid after charging simple interest with the help creating a method
package com.apjfsa;

//importing scanner class
import java.util.Scanner;

public class SimpleInterestMethod {

	// creating method for calculating simple interest
	public static float calculateSimpleInterest(float principal, float rate, float time) {
		
		// declaring variable
		float simpleinterest;

		// formula for simple interest
		simpleinterest = (principal * time * rate) / 100;

		// returning simple interest
		return simpleinterest;
	}

	public static void main(String[] args) {

		// creating object for scanner class
		Scanner sc= new Scanner(System.in);

		// variables to store principal,rate and time
		float principal, rate, time;

		// taking input through the keyboard
		System.out.println("Enter Principal:");
		principal = sc.nextFloat();
		System.out.println("Enter rate:");
		rate = sc.nextFloat();
		System.out.println("Entertime:");
		time = sc.nextFloat();

		// calling method and storing it's value in interest variable
		float interest = calculateSimpleInterest(principal, rate, time);

		float amount = principal + interest;

		System.out.println("Amount to be paid after charging simple interest is " + amount);

	}
}
