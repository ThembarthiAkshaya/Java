//program on tree set of employee class using comparable interface for sorting the details according to employee id
package collections_topic;

public class EmployeeOfSortingBasedOnId implements Comparable<EmployeeOfSortingBasedOnId> {
	
	//variable to store the employee id
	private int empid;
	
	//variable to store the employee salary
	private int salary;
	
	//variable to store the employee  name
	private String empname;
	
	//variable to store the employee age
	private int age;
	
	//variable to store the employee designation
	private String designation;

	//parameterized constructor
	public EmployeeOfSortingBasedOnId(int empid, int salary, String empname, int age, String designation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.age = age;
		this.designation = designation;
	}

	//getter method to return employee id
	public int getEmpid() {
		return empid;
	}

	//setter method to set employee id
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	//getter method to return employee salary
	public int getSalary() {
		return salary;
	}

	//setter method to set employee salary
	public void setSalary(int salary) {
		this.salary = salary;
	}

	//getter method to return employee name
	public String getEmpname() {
		return empname;
	}

	//setter method to set employee name
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	//getter method to return employee age
	public int getAge() {
		return age;
	}

	//setter method to set employee age
	public void setAge(int age) {
		this.age = age;
	}

	//getter method to return employee designation
	public String getDesignation() {
		return designation;
	}

	//setter method to set employee designation
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "\nEmployee Id: " + empid + "\nName : " + empname + "\n Salary : " + salary + "\n Age : " + age
				+ "\n Designation : " + designation + "\n-------------------------------------------------";
	}

	public int compareTo(EmployeeOfSortingBasedOnId emp1) {
		return (this.empid - emp1.empid);
	}
}
