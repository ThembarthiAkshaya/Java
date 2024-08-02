//program on armstrong number

package com.apjfsa;

//importing scanner class
import java.util.Scanner;

public class ArmstrongNumber {

	// defining a method to count the number digits in the number
	public static int NoOfDigts(int x) {

		// initializing a variable to store the count
		int count = 0;

		while (x != 0) {

			x = x / 10;// 123456
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// declaring a variable to store the number
		int num, temp, remainder;
		int armstrong = 0;

		// taking input through the user
		System.out.println("Enter a number");
		num = sc.nextInt();

		temp = num;// storing the number in the temporary
		int count = NoOfDigts(num); // calling the method

		while (num != 0) {
			remainder = num % 10;
			num = num / 10;
			armstrong += Math.pow(remainder, count);
		}
		if (temp == armstrong)
			System.out.println(armstrong + " is an armstrong number");
		else
			System.out.println(armstrong + " is not an armstrong number");
	}

}
