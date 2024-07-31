package com.apjfsa;

import java.util.Scanner;

public class Calculator {
	// creating main method
	public static void main(String[] args) {
		// creating an object to scanner class
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int choice;// declaring two numbers
		do {
			System.out.println("Enter number1:");
			num1 = sc.nextInt();
			System.out.println("Enter number2:");
			num2 = sc.nextInt();
			System.out.println("Select any one of the below operations");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.division");
			System.out.println("Enter any one of the operations");
			int operation = sc.nextInt();
			switch (operation) {
			case 1:
				System.out.println("Addition:" + (num1 + num2));
				break;
			case 2:
				System.out.println("Subtraction:" + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplication:" + (num1 * num2));
				break;
			case 4:
				System.out.println("Division of" + num1 + "and" + num2 + "is:" + (num1 / num2));
				break;
			default:
				System.out.println("Invalid operation");
			}
			System.out.println("Press 0 to exit or any other number to continue");
			choice = sc.nextInt();

			
		} while (choice != 0);
		
	}

}
