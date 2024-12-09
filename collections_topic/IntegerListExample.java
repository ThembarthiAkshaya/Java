//program on creating a list of integers and performing different methods on it
package collections_topic;

//importing util package
import java.util.*;

public class IntegerListExample {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		
		// Adding strings to the list
				list.add(07);
				list.add(12);
				list.add(2002);
				list.add(21);
				list.add(2025);
				
				System.out.println("Printing list :"+list);

				/*------creating iterator-------*/
				Iterator iterator = list.iterator();

				System.out.println("-----------------Integer List----------------");
				// displaying the elements of the list
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}

				/*----------performing different methods on the list-----------*/
				System.out.println("--------------------------------");
				System.out.println("Element at 0th position is :" + list.get(0)); // accessing a specific integer
				System.out.println("list contain 2025 :" + list.contains(2025)); // Check if the list contains a
																								// specific integer
				list.remove(2025); // Remove an element from the list
				System.out.println("Total no of elements :" + list.size()); // Get the size of the list
				list.clear(); // Clear the list
				System.out.println("After removing all the strings from the list:" + list.size());
			
	}
}
