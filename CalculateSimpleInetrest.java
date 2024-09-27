package com.apjfsa;
//importing scanner class
import java.util.Scanner;

class SimpleInterest {
	
	//instance variables
	int principal, time, rateOfInterest;
    
	//creating method to input the data
	void input(int p, int t, int i) {
		principal = p;
		time = t;
		rateOfInterest = i;
	}
    
	//creating method to calculate simple interest
	float calculateSimpleInterest() {
		float simpleinterest = (principal * time * rateOfInterest) / 100;
		return simpleinterest;
	}
}
//initial class
public class CalculateSimpleInetrest {

	public static void main(String[] args) {
		
		//creating object for scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount(in rupees):");
		int amount = sc.nextInt();  //taking input through the keyboard
		System.out.println("Enter the timespan(in year):");
		int year = sc.nextInt();
		System.out.println("Enter the interest:");
		int interest = sc.nextInt();
       
		//creating object for SimpleInterest class
		SimpleInterest si = new SimpleInterest();
		
		//calling the methods
		si.input(amount, year, interest);
		float SimpleInterest = si.calculateSimpleInterest();
		float totalamount = amount + SimpleInterest;
		System.out.println("" + "the total amount to be paid after" + year + "years is:" + totalamount);
		sc.close();
	}

}
