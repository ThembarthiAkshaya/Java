//program on tree set of a states and performing different methods on it
package collections_topic;

//importing util package
import java.util.*;

public class TreeSet_Example {

	public static void main(String[] args) {
		
		//tree set of names of states
		TreeSet<String> statenames=new TreeSet<String>();
		statenames.add("Delhi");
		statenames.add("Telangana");
		statenames.add("Rajasthan");
		statenames.add("Bihar");
		statenames.add("Uttarapradesh");
		
		//printing the state names before performing the methods
		System.out.println("state names before performing operations:");
		System.out.println(statenames);
		
		//performing different methods on the tree set
		System.out.println(statenames.pollLast());
		System.out.println(statenames.pollFirst());
		System.out.println(statenames.add("Goa"));
		System.out.println(statenames.floor("Rajasthan"));
		System.out.println(statenames.lower("Goa"));
		System.out.println(statenames.higher("Delhi"));
		System.out.println(statenames.first());
		System.out.println(statenames.last());
		System.out.println(statenames.remove("Telangana"));
		System.out.println(statenames.size());
		
		//printing the state names after performing the methods
		System.out.println("state names after performing operations:");
		System.out.println(statenames);
	}
}
