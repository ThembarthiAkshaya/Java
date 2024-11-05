//program on comparable interface for employee class and sorting the elements of the employee class based on employee designation
package collections_topic;

//importing tree set class
import java.util.TreeSet;

//Class to demonstrate sorting Employee objects based on their designation using Comparable interface
public class TreeSetOfEmployeeDesination {

	public static void main(String[] args) {
		
		//TreeSet of Employee
		TreeSet<EmployeeOfSortingBasedOnDesignation> emplist2=new TreeSet<EmployeeOfSortingBasedOnDesignation>();
		
		/*-----------------------Data Insertion-------------------------*/
		// Adding Employee objects to the TreeSet
		emplist2.add(new EmployeeOfSortingBasedOnDesignation(101,13000,"Geeta",23,"TeamLead"));
		emplist2.add(new EmployeeOfSortingBasedOnDesignation(102,14000,"Rani",24,"Manager"));
		emplist2.add(new EmployeeOfSortingBasedOnDesignation(103,14870,"Vani",21,"Developer"));
		
		// Printing the TreeSet which will display the sorted Employee objects.
        System.out.println(emplist2);

	}
}
