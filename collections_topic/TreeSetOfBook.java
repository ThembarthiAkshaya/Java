//Creates a TreeSet of Book objects and adds several books with different prices.
//Prints the books sorted by their price in ascending order.
package collections_topic;

//importing util package
import java.util.*;

public class TreeSetOfBook {

	public static void main(String[] args) {
		// tree set of books
		TreeSet<Book> book = new TreeSet<Book>();

		// adding data of several books
		book.add(new Book(102, "Data Structures", "Jane Smith", 19.99));
		book.add(new Book(103, "Algorithms", "Alice Johnson", 25.99));
		book.add(new Book(101, "Java Programming", "John Doe", 29.99));

		// printing the book sorted by their price
		System.out.println(book);
	}
}
