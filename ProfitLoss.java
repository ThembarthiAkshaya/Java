package com.apjfsa;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);
		// declaring variables to store selling price and cost price
		int cp, sp;
		// inputing data through keyboard
		System.out.println("Enter cost price:");
		cp = sc.nextInt();
		System.out.println("Enter selling price:");
		sp = sc.nextInt();

		/* Displaying the date */
		System.out.println("cost price:" + cp);
		System.out.println("selling price" + sp);

		/*---to determine profit or loss----*/
		if (cp > sp)
			System.out.println("Loss:" + (cp - sp));
		else
			System.out.println("Profit:" + (sp - cp));
	}

}
