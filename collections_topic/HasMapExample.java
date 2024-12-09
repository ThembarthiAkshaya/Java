package collections_topic;

import java.util.*;

public class HasMapExample {

	public static void main(String args[]) {
		
		//creating a hash map
		//Integer is the type of key and string is the type of value
		HashMap<Integer,String> students=new HashMap();

		//inserting entries in hash map
		students.put(1,"Akash");
		students.put(4,"Akshaya");
		students.put(2, "Anil");
		students.put(5, "Sumanth");
		students.put(3,"Akanksha");

		//displaying
		System.out.println(students);
		/*---------------------------------------------*/
		//inserting a new entry with existing key
		students.put(5,"Akshitha");

		//displaying
		System.out.println(students);
		
		//inserting a new entery with existing one
		students.putIfAbsent(5,"Bhavana");
		
		//displaying
		System.out.println(students);
		
		//key set method for iterating through the elements
		//set view of keys of map
		System.out.println("---------------------");
		for(Integer keys:students.keySet()) {
			System.out.println(keys+"-"+students.get(keys));
		}
		
        /*----------------Using entry interface for traversal of elements of map-------------*/
		Set setViews=students.entrySet();
		
		//entry set method for iterating through the elements
		//creating iterator
		Iterator studentIterator=setViews.iterator();
		while(studentIterator.hasNext()) {
			Map.Entry<Integer,String> entry=(Map.Entry)studentIterator.next();
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}
}
