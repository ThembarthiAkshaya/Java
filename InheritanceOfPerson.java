package com.apjfsa;

//Base class representing a person
class Person {
	// Fields to store the name and age of the person
	String name;
	int age;

	// Parameterized constructor to initialize name and age
	Person(String name, int age) {
		this.name = name; // Initialize name
		this.age = age; // Initialize age
	}

	// Method to display details of the person
	void displayDetails() {
		System.out.println("--------From Person Class(Base Class)--------");
		System.out.println("Name:" + name); // Print the name of the person
		System.out.println("Age:" + age); // Print the age of the person
	}
}

//Subclass representing an employee, which is a type of person
class Employee extends Person {

	// Field to store the employee ID
	int employeeId;

	// Parameterized constructor to initialize name, age, and employee ID
	Employee(String name, int age, int employeeId) {
		super(name, age); // calling Parent class constructor
		this.employeeId = employeeId; // Initialize employee ID
	}

	// Method to display details of the employee, including employee ID
	void displayDetails() {
		System.out.println("--------From Employee Class(Derived Class)--------");
		System.out.println("Name:" + name); // Print the name of the employee
		System.out.println("Age:" + age); // Print the age of the employee
		System.out.println("Employee ID:" + employeeId); // Print the employee ID
	}
}

//Main class to test the Person and Employee classes
public class InheritanceOfPerson {

	public static void main(String[] args) {
		// Create an instance of Employee with name Reenu, age 24, and employee ID 101
		Employee emp = new Employee("Reenu", 24, 101);

		// Display details of the employee
		emp.displayDetails();
	}

}
