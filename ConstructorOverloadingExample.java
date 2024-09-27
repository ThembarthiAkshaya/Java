//program on constructor overloading
package com.apjfsa;

import java.util.Scanner;

class Num1 {
	int num1, num2;

	/*----------Non parameterized constructor-----------*/
	Num1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
	}
    /*----Parameterized constructor------*/
	Num1(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
    /*----------Method to display numbers---------*/
	public void display() {
		System.out.println("First no:" + num1);
		System.out.println("Second no:" + num2);
	}
}

public class ConstructorOverloadingExample {

	public static void main(String[] args) {
		// object creation for Number class
		Num1 n1 = new Num1();
		System.out.println("------object id: "+n1+"------");
		n1.display();
		
		n1 = new Num1(2, 3); // here object will get new memory so it is different object
		System.out.println("------object id: "+n1+"------");
        n1.display();
        
        Num1 n2 = new Num1(43,45);
		System.out.println("------object id: "+n2+"------");
		n2.display();
	}

}
