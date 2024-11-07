package collections_topic;

import java.util.*;

public class TreeSetOfBook {

	public static void main(String[] args) {
		//tree set of book
		TreeSet<Book> book=new TreeSet<Book>();
		
		//adding data
		book.add(new Book(102,"Data Structures","Jane Smith",19.99));
		book.add(new Book(103,"Algorithms","Alice Johnson",25.99));
		book.add(new Book(101,"Java Programming","John Doe",29.99));

		System.out.println(book);
	}

}
