//program on creating a list of strings and performing different methods on it
package collections_topic;

//importing util package
import java.util.*;

public class StringListExample {

	public static void main(String[] args) {
		// Create an ArrayList to hold String objects
		List<String> list = new ArrayList();

		// Adding strings to the list
		list.add("banana");
		list.add("Mango");
		list.add("grapes");
		list.add("Strawberry");
		list.add("banana");
		
		System.out.println("Printing list :"+list);

		/*------creating iterator-------*/
		Iterator iterator = list.iterator();

		System.out.println("-----------------String List----------------");
		// displaying the elements of the list
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		/*----------performing different methods on the list-----------*/
		System.out.println("--------------------------------");
		System.out.println("Element at 0th position is :" + list.get(0)); // accessing a specific string
		System.out.println("list contain strawberry :" + list.contains("Strawberry")); // Check if the list contains a
																						// specific string
		list.remove(2); // Remove a string from the list
		System.out.println("After removing an element is :" + list.get(2));
		System.out.println("Total no of elements :" + list.size()); // Get the size of the list
		list.clear(); // Clear the list
		System.out.println("After removing all the strings from the list:" + list.size());
	}
}
