package collections_topic;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		/*------creating ArrayList------*/
		ArrayList obj=new ArrayList();
		obj.add("Akshaya");
		obj.add(21);
		obj.add("Bhavya");
		obj.add(89.57f);
		/*--------------------------------*/
		System.out.println("List is : ");
		System.out.println(obj);
		
		/*--------creating iterator-----*/
		Iterator listexample=obj.iterator();
		System.out.println("---------------------");
		while(listexample.hasNext()) {
			String s1=(String)listexample.next();
			System.out.println(listexample.next());
		}
		/*----ArrayList of integers-----*/
		ArrayList<Integer> numbers=new ArrayList();
		/*-----inserting data into arrayList----------*/
		numbers.add(45);
		numbers.add(89);
		numbers.add(45);
	    /*------------------------------------*/
		/*----------creating iterator-------------*/
		Iterator<Integer> numiterator=numbers.iterator();
		System.out.println("Array elements are:");
		while(numiterator.hasNext()) {
			Integer i=numiterator.next();  //type casting explicitly because we are dealing with non generic type
			System.out.println(i);
		}
		
	}

}
