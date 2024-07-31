//method without return type example

package com.apjfsa;

//importing scanner class
import java.util.Scanner;

public class MethodOfEvenOdd {

	// creating method to check the a number is even or odd
	public static void evenOrOdd(int x) {
		if (x % 2 == 0)
			System.out.println(x + " Even number");
		else
			System.out.println(x + " Odd number");
	}

	public static void main(String[] args) {

		// Creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// taking input through the keyboard
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		// calling the method
		evenOrOdd(num);

	}
}
