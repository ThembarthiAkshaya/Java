//Program on printing prime series

package com.apjfsa;

//importing scanner class
import java.util.Scanner;

/*--defining a class for Prime  */
class Prime {

	// creating method for to check a number is prime or not
	public boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

public class PrimeNumberSeries {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// taking input through keyboard
		System.out.print("Enter the  ending number to print the prime number series:");
		int endNum = sc.nextInt();

		// creating object for Prime class
		Prime p = new Prime();

		for (int i = 1; i <= endNum; i++) {
			if (p.isPrime(i)) // calling the method
			{
				System.out.println("Prime numbers are:");
				System.out.print(i + ",");
			}

		}
	}
}
