package collections_topic;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> listobj=new LinkedList();
        listobj.add("Anuj");
        listobj.add("Sushil");
        listobj.add("Reenu");
        listobj.add("Sachin");
        
        System.out.print("List is: ");
        System.out.println(listobj);
        listobj.addFirst("Hey");
        
	}

}
