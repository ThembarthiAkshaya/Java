/*program on checking sum of two numbers is positive or negative with the help of creating methods */
package com.apjfsa;

import java.util.Scanner;

public class PostiveOrNegative {
	// method for adding two numbers
	public static int Add(int x, int y) {
		return x + y;
	}

	// method to check the number is positive or negative
	public static void checkPositiveOrNegative(int x) {
			if (x > 0)
				System.out.println(x + " is positive number");
			else if(x==0)
				System.out.println(x+" it is neither positive or negative;");
			else
				System.out.println(x + " is negative number");

		}

	public static void main(String[] args) {

		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// declaring variables to store two numbers
		int num1, num2;

		// taking input through the keyboard
		System.out.println("Enter 1st number:");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number:");
		num2 = sc.nextInt();

		// calling method and storing it's value in sum variable
		int sum = Add(num1, num2);

		// calling the method
		checkPositiveOrNegative(sum);
	}

}
