//program on inserting and deleting elements into dequeue by using array dequeue and performing various methods
package collections_topic;

//importing util package
import java.util.*;

public class ArrayDequeExample {

	public static void main(String[] args) {

		/*----array dequeue of integers-----*/
		ArrayDeque<Integer> numbers = new ArrayDeque<Integer>();

		// inserting numbers at front end
		numbers.addFirst(24);
		numbers.addFirst(34);
		numbers.addFirst(45);
		numbers.offerFirst(54);
		numbers.offerFirst(47);

		// inserting numbers at last end
		numbers.offerLast(47);

		// removing element from last end
		numbers.removeLast();

		// removing element from the first end
		numbers.removeFirst();

		// inserting elements into dequeue
		numbers.offerLast(56);
		numbers.offerFirst(6);

		// Traversing list through Iterator
		Iterator<Integer> iterator = numbers.iterator();

		// getting the Iterator
		while (iterator.hasNext()) { // check if iterator has the elements
			System.out.print(iterator.next() + " "); // printing the element and move to next
		}

		System.out.println("\n" + numbers.getFirst());
		System.out.println("" + numbers.peekFirst());
		System.out.println("" + numbers.peekLast());
		System.out.println("" + numbers.pollFirst());
		System.out.println("" + numbers.getLast());
		System.out.println("" + numbers.getFirst());
		System.out.println("" + numbers.pollLast());

		// Traversing list through Iterator
		Iterator<Integer> iterator2 = numbers.iterator();
		while (iterator2.hasNext()) { // check if iterator has the elements
			System.out.print(iterator2.next() + " "); // printing the element and move to next
		}
	}
}
