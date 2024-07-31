package com.apjfsa;

import java.util.Scanner;

public class GreatestOfTwo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'a' value");
		int a = sc.nextInt();
		System.out.println("Enter 'b' value");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(a + "is greater");
		} else {
			if (a < b)
				System.out.println(b + "is greater");
			else
				System.out.println("Both are equal");
		}
	}
}
