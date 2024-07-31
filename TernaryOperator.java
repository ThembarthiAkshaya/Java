//program on ternary operators
package com.apjfsa;

//importing scanner class
import java.util.Scanner;

public class TernaryOperator {
	public static void main(String args[]) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// taking input through keyboard
		System.out.println("Enter 'a' nummber:");
		int a = sc.nextInt();
		System.out.println("Enter 'b' value");
		int b = sc.nextInt();

		// ternary operator
		int c = (a > b) ? a : b;
		// displaying value
		System.out.println("c=" + c);
	}
}
