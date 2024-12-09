package collections_topic;

//importing util package
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// To create a hash set of statements
		HashSet<String> statenames = new HashSet<String>();

		// inserting objects
		statenames.add("Delhi");
		statenames.add("Punjab");
		statenames.add("Tamilnadu");
		statenames.add("Haryana");
		statenames.add("Telangana");

		// displaying hash set
		System.out.println("Name of Statename");
		System.out.println(statenames);

		//to find number of elements
		System.out.println("No of elements:" + statenames.size());
		
		//to check element is present or not
		System.out.println("Is Haryana present in the set or not:" + statenames.contains("Haryana"));

	    if(statenames.contains("Punjab")) {
	    	//deleting punjab
	    	statenames.remove("Punjab");
	    	System.out.println("After removing punjab:\n The Hash Set is:");
	    	System.out.println(statenames);
	    }
	    else {
	    	System.out.println("Punjab is not present");
	    }
	}
}
