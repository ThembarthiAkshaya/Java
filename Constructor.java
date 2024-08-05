//writing program on constructors
package com.apjfsa;

//creating a class for constructor creation
class ShowRoom {
	// instance variables to store customer details and transaction amounts
	String Customer_name;
	long mobile_no;
	double cost;
	double dis;
	double amount;

	// default constructor
	ShowRoom() {
		// Prints a message indicating the use of the default constructor
		System.out.println("Default constructor");
	}

	// Method to input customer details and cost
	public void input(String cust_name, long phno, double price) {
		Customer_name = cust_name;
		mobile_no = phno;
		cost = price;

	}

	// creating method to calculate discount
	public void calculate() {
		// Determine the discount based on the cost
		if (cost <= 10000)
			dis = (cost * 5) / 100;// 5% discount for cost <= 10000
		else if (cost >= 10000 && cost <= 20000)
			dis = (cost * 10) / 100;// 10% discount for cost between 10001 and 20000
		else if (cost >= 20000 && cost <= 35000)
			dis = (cost * 15) / 100;// 15% discount for cost between 20001 and 35000
		else
			dis = (cost * 20) / 100; // 20% discount for cost > 35000
	}

	// creating method to display the details of a customer
	public void display() {
		System.out.println("customer name:" + Customer_name);
		System.out.println("Mobile no:" + mobile_no);
		System.out.println("cost:" + cost);
		// Calculate and display the amount after applying the discount
		amount = (cost - dis);
		System.out.println("Amount to be paid after discount:" + amount);
	}
}

//initial class
public class Constructor {

	public static void main(String[] args) {
		// creating object for class
		ShowRoom obj = new ShowRoom();
		// Inputting data for the first customer
		obj.input("Sachin", 7005467832L, 5000);
		obj.calculate();
		obj.display();
		ShowRoom obj1 = new ShowRoom();
		obj.input("Reenu", 6783456780L, 40000);
		obj1.calculate();
		obj.display();
	}

}
