 // Package declaration for encapsulation concept demonstration
package encapsulatio_concept;

public class EmployeeData {

	public static void main(String[] args) {
		// Creating an instance of the EmployeeDetails class
		EmployeeDetails ed = new EmployeeDetails();
		
		/*--------Setting Data---------*/
		ed.setEmpId("emp101");                     // Setting the employee ID
		ed.setEmpName("Akshaya");                  // Setting the employee name
		ed.setDesignation("Software Developer");   // Setting the employee designation
		ed.setAge(21);                             // Setting the employee age
		ed.setSalary(30000);                        // Setting the employee salary

		/*----------Getting Data-----------*/
		// Using getter methods to retrieve and display employee details
		System.out.println("Employee ID           :" + ed.getEmpId());   // Displaying employee ID
		System.out.println("Employee Name         :" + ed.getEmpName());  // Displaying employee name
		System.out.println("Employee Designation  :" + ed.getDesignation());   // Displaying employee designation
		System.out.println("Employee age          :" + ed.getAge());  // Displaying employee age
		System.out.println("Employee salary       :" + ed.getSalary());  // Displaying employee salary
	}

}
