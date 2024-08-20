package com.apjfsa;

//importing scanner class
import java.util.Scanner;
class Numbers {
	/* -----Member variable------ */
	int num1, num2;

	// method to input data from user through keyboard
	public void inputNumbers() {
		// object of scanner class
		Scanner sc = new Scanner(System.in);
		/*------input  data through keyboard-----*/
		System.out.println("Enter first number:");
		num1 = sc.nextInt();
		System.out.println("Enter second number:");
		num2 = sc.nextInt();
	}

	/*------method to display data------- */
	public void displayNumbers() {

		System.out.println(" first number:" + num1);
		System.out.println("Second number:" + num2);

	}

}

/*-----derived class------*/
class NumericCaluculation extends Numbers {
	/*---------method for addition of two numbers --------*/
	public void addition() {
		/*----input of numbers------*/
		super.inputNumbers();
		/*------calculating addition------*/
		int sum = super.num1 + super.num2;
		/*-----Displaying numbers-----*/
		System.out.println("Sum:" + sum);
		System.out.println("-------------------------------------");
	}

	/*------------method for difference------------*/
	public void difference() {
		/*------input of numbers------*/
		super.inputNumbers();
		/*-----------calculating difference---------*/
		int sub = super.num1 - super.num2;
		System.out.println("Differenec:" + sub);
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericCaluculation nc = new NumericCaluculation();
		nc.addition();
		nc.difference();
	}

}
