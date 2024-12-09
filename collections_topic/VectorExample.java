package collections_topic;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		//creating vector
       Vector<String> statename=new Vector<String>();
       
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
       
       Vector<Integer> number=new Vector<Integer>();
       number.add(9);
       number.add(3);
       number.add(156);
      /*--------------------------------------*/
       System.out.println("Displaying name of states :-");
       
       //traversing vector through the iterator
       Iterator<String> states=statename.iterator();
       
       //getting the Iterator 
       while(states.hasNext()) {//check if iterator has the elements
    	 System.out.println(states.next());  //printing the element and move to next  
       }
       
       /*-------------performing methods on the vector-----------*/
		System.out.println(statename.contains("Manipur"));
		System.out.println(statename.containsAll(statename));
		System.out.println(statename.elementAt(5));
		System.out.println(statename.removeElement("Rajastan"));
		System.out.println(statename.capacity());
		System.out.println(statename.hashCode());
		System.out.println(statename.clone());
		//System.out.println(number.sort(null));
	}

}
