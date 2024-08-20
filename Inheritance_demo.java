/*program on bank account managements  */
package com.apjfsa;

import java.util.Scanner;

/*------------base class--------------*/
class Account {
	// member variables
	String acHoldername;
	String branch_name;
	int ac_no;
	Scanner sc;

	/*----------------------------*/
	Account() {
		sc = new Scanner(System.in);

	}

	// method for input account details
	public void inputAcDetails() {
		System.out.println("------------------------------");
		System.out.println("A/c no:");
		ac_no = sc.nextInt();
		sc.next();
		System.out.println("A/c holder name:");
		acHoldername = sc.nextLine();
		sc.next();
		System.out.println("Branch name:");
		branch_name = sc.nextLine();
	}

	/*---------------method to display account details--------------*/
	public void displayAcDetails() {
		System.out.println("-----------Account Detatails-----------");
		System.out.println("A/c no:" + ac_no);
		System.out.println("A/c holder name:" + acHoldername);
		System.out.println("Branch name:" + branch_name);
	}

}

/*------------derived class:Savings Account and Base class-------------*/
class SavingAccounts extends Account {
	// member variable
	float balance;

	/*-------------method to initialize blance-------------------*/
	public void initialzebalance() {
		/*------calling the inputAccountDeatails----------*/
		super.inputAcDetails();
		System.out.println("Enter the initial balance:");
		balance = sc.nextFloat();
		System.out.println("---------------------------------------");
	}
    /*-------Method Acinfo-----------*/
	public void acInfo() {

		// calling base class method to display the details
		super.displayAcDetails();
		System.out.println("Available balance:Rs" + balance);

	}

	/*-------------method to withdraw Amount---------------*/
	public void withdraw() {
		/*----------------Amount to withdraw----------------*/
		System.out.println("--------------Amount withdraw operation");
		System.out.println("Enter the amount:");
		float amount = super.sc.nextFloat();
		if (balance - amount > 10000) {
			balance = balance - amount;
			System.out.println("Withdraw successfully");
			System.out.println("Available balance" + balance);

		} else {
			System.err.println("Insufffient balance");
			System.err.println("Withdrawal not possible");
		}
	}

	public void deposit() {
		System.out.println("--------------Amount withdrawal operation");
		System.out.println("Enter the amount:");
		float amount = super.sc.nextFloat();

		balance = balance - amount;
		System.out.println("Deposited successfully");
		System.out.println("Available balance" + balance);
	}

}

public class Inheritance_demo {

	public static void main(String[] args) {
		SavingAccounts sva = new SavingAccounts();
		sva.displayAcDetails();

	}

}
