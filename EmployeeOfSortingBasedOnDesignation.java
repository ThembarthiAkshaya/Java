package collections_topic;

public class EmployeeOfSortingBasedOnDesignation implements Comparable<EmployeeOfSortingBasedOnDesignation> {
	private int empid;
	private int salary;
	private String empname;
	private int age;
	private String designation;
	
	public EmployeeOfSortingBasedOnDesignation(int empid, int salary, String empname, int age,String designation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.age = age;
		this.designation=designation;
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
		return"\nDesignation :"+designation+
				"\nEmployee Id: " + empid +
				"\nName : " + empname + 
				"\n Salary : " + salary + 
				"\n Age : " + age +
				"\n-------------------------------------------------";
	}
	
	public int compareTo(EmployeeOfSortingBasedOnDesignation emp) {
		return (this.designation.compareTo(emp.designation));
	}
}
