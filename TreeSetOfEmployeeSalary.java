//program on comparable interface for employee class and sorting the elements of the employee class based on salary
package collections_topic;

//importing tree set class
import java.util.TreeSet;

public class TreeSetOfEmployeeSalary {

	public static void main(String[] args) {
		/*-----------------------------------*/
		//TreeSet of Employee
		TreeSet<EmployeeOfSortingBasedOnSalary> emplist1=new TreeSet<EmployeeOfSortingBasedOnSalary>();
		/*----Data Insertion-----*/
		emplist1.add(new EmployeeOfSortingBasedOnSalary(101,13000,"Geeta",23,"TeamLead"));
		emplist1.add(new EmployeeOfSortingBasedOnSalary(102,14000,"Rani",24,"Manager"));
		emplist1.add(new EmployeeOfSortingBasedOnSalary(103,14870,"Vani",21,"Developer"));
		/*-----------------------------------------------------*/
        System.out.println(emplist1);

	}
}
