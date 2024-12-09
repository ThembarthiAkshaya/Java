//program on creating  a vector using an array list 
package collections_topic;

//importing util package
import java.util.*;

public class VectorUsingArrayList {

	public static void main(String[] args) {
		// creating array list of states
		ArrayList<String> statename = new ArrayList();
		
		/*--------insertion into array list----------*/
		statename.add("Delhi");
		statename.add("Telangana");
		statename.add("UttarPradesh");
		statename.add("Andrapradesh");
		statename.add("HimacalPradesh");
		statename.add("Manipur");
		statename.add("Rajastan");
		statename.add("Tamilnadu");
		statename.add("Kerala");
		statename.add("Gujarat");
	
		/*---------------------------------------------*/
		/*----------create a vector from above array list--------*/
		Vector<String> statelist = new Vector(statename);
		
        System.out.println("States are: ");
		
		//Traversing vector through Iterator  
		Iterator<String> states = statelist.iterator();
		
		//displaying the vector elements
		while (states.hasNext()) {
			System.out.println(states.next()); 		
		}
		
	}
}
