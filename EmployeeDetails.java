// Program to demonstrate the concept of encapsulation by creating a class with private variables
// and providing public getter and setter methods to access and modify them.

// Package declaration for encapsulation concept demonstration
package encapsulatio_concept;
class EmployeeDetails{
	// Private member variables to ensure encapsulation of employee details
	private String empId;          // Employee ID
	private String empName;        // Employee name
	private String designation;   // Employee designation
	private int age;              // Employee age
	private float salary;         // Employee salary

	// Getter method for employee ID
	public String getEmpId() {
		return empId;
	}

	// Setter method for employee ID
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	// Getter method for employee name
	public String getEmpName() {
		return empName;
	}

	// Setter method for employee name
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	// Getter method for employee designation
	public String getDesignation() {
		return designation;
	}

	// Setter method for employee designation
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	// Getter method for employee age
	public int getAge() {
		return age;
	}

	// Setter method for employee age
	public void setAge(int age) {
		this.age = age;
	}

	// Getter method for employee salary
	public float getSalary() {
		return salary;
	}

	// Setter method for employee salary
	public void setSalary(float salary) {
		this.salary = salary;
	}

}

