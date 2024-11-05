//program on comparable interface for employee class and sorting the elements of the employee class based on employee id
package collections_topic;

//importing util package
import java.util.*;

public class TreeSetOfEmployeeId {

	public static void main(String[] args) {
		//TreeSet of Employee
		TreeSet<EmployeeOfSortingBasedOnId> emplist=new TreeSet<EmployeeOfSortingBasedOnId>();
		/*---- Data Insertion --------*/
		emplist.add(new EmployeeOfSortingBasedOnId(101,13000,"Geeta",23,"TeamLead"));
		emplist.add(new EmployeeOfSortingBasedOnId(102,14000,"Rani",24,"Manager"));
		emplist.add(new EmployeeOfSortingBasedOnId(103,14870,"Vani",21,"Developer"));

		System.out.println(emplist);
    }
}


