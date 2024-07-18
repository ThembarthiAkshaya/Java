//program on calculating simple interest

package com.apjfsa;

import java.util.*;

public class SimpleIntrest {
	// creating main method
	public static void main(String[] args) {
		// creating an object to scanner class
		Scanner sc = new Scanner(System.in);
		float simpleintrest;
		System.out.println("Enter principle/Amount:");
		int p = sc.nextInt();// taking input from user
		System.out.println("Enter rate of intrest:");
		float r = sc.nextFloat();
		System.out.println("Enter time span:");
		int t = sc.nextInt();
		simpleintrest = (p * t * r) / 100;
		System.out.println("Simple Intrest is:" + simpleintrest);
	}
}
