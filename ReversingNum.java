//program on printing reverse of a number

package com.apjfsa;

//importing scanner class
import java.util.Scanner;

public class ReversingNum {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		// declaring variables to store it's remainder
		int remainder;
		int rev = 0;
		while (num != 0) {
			remainder = num % 10;
			num = num / 10;
			rev = rev * 10 + remainder;
		}
		System.out.println("reverse = " + rev);
	}

}
