package collections_topic;
import java.util.*;
public class LinkedList_demo {

	public static void main(String[] args) {
		LinkedList<String> listobj=new LinkedList();
		listobj.add("Akshaya");
		listobj.add("Akshitha");
		
		Iterator<String> stdnames=listobj.iterator();
		listobj.addFirst("sahil");
		System.out.println("List is :");
		while(stdnames.hasNext()) {
			System.out.println();
		}
	}

}
