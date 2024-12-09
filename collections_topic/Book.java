//Defines the Book class with the appropriate fields, constructor, and getter/setter methods.
//Implements the Comparable interface in the Book class, overriding the compareTo() method to compare books by their price.

package collections_topic;

public class Book implements Comparable<Book> {
	//variable to store the Book id
	private int bookId;
	
	//variable to store the Book title
	private String title;
	
	//variable to store the Book author
	private String author;
	
	//variable to store the Book price
	private double price;

	//parameterized constructor
	public Book(int bookId, String title, String author, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//getter method to return book id
	public int getBookId() {
		return bookId;
	}

	//setter method to set book id
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	//getter method to return book title
	public String getTitle() {
		return title;
	}

	//setter method to set book title
	public void setTitle(String title) {
		this.title = title;
	}

	//getter method to return book author
	public String getAuthor() {
		return author;
	}

	//setter method to set book author
	public void setAuthor(String author) {
		this.author = author;
	}

	//getter method to return book price
	public double getPrice() {
		return price;
	}

	//setter method to set book price
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return"\nBookId : " +bookId + "\ntitle: " + title + "\n Author : " + author
				+ "\nPrice: " +price+ "\n-------------------------------------------------";
	}

	@Override
	public int compareTo(Book book) {
		return Double.compare(this.price, book.price);
	}
}
