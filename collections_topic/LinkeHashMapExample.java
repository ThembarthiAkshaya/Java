package collections_topic;

import java.util.HashMap;

public class LinkeHashMapExample {

	public static void main(String[] args) {
		//creating a hash map
				//Integer is the type of key and string is the type of value
				LinkedHashMap<Integer,String> students=new LinkedHashMap();

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

	}

}
