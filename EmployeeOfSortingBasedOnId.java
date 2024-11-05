//program on tree set of employee class using comparable interface for sorting the details according to employee id
package collections_topic;

public class EmployeeOfSortingBasedOnId implements Comparable<EmployeeOfSortingBasedOnId> {
	private int empid;
	private int salary;
	private String empname;
	private int age;
	private String designation;

	public EmployeeOfSortingBasedOnId(int empid, int salary, String empname, int age, String designation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.age = age;
		this.designation = designation;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

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
