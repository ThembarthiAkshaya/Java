/*--program on counting the number of digits of a program-- */
package com.apjfsa;

//importing scanner class
import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {

		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// Taking input through keyboard
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		// initializing a variable
		int count = 0;

		// here stopping condition is n!=0

		while (num != 0) {
			num = num / 10;// 123456
			count++;
		}
		System.out.println("No of Digits are: "+count);
	}

}
