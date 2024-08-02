/*Writing a program to check a number is perfect number or not */
package com.apjfsa;

//importing Scanner class
import java.util.Scanner;

public class PerfectNumber {
//creating main method
	public static void main(String[] args) {

		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// initializing a variable to store the sum
		int sum = 0;

		// taking input through the keyboard
		System.out.print("Enter a number:");
		int num = sc.nextInt();

		if (num <= 0)
			System.out.println("Enter the number Greater than zero");
		else {
			// logic to know the perfect number
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum += i;
				}
			}
			// comparing whether the sum is equal to number or not
			if (num == sum)
				System.out.println(sum + " is Perfect number");
			else
				System.out.println(num + " is not Perfect number");
		}
	}
}
