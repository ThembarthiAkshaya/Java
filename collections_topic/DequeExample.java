//program on using dequeue interface and performing different methods of it.
package collections_topic;

//importing util package
import java.util.*;

public class DequeExample {

	public static void main(String[] args) {
		/*----dequeue of strings-----*/
        Deque<String> names=new ArrayDeque<>();
        
        //insert operations
        names.addFirst("vineela");
        names.addLast("Sandhya");
        names.addFirst("aruna");
        names.addFirst("soni");
        names.addLast("Geetha");
        names.addLast("hello");
        names.addFirst("Lilli");
        
        //removing elements
        names.removeFirst();
        names.pollLast();
        names.offerFirst("Sreeja");
        names.removeLast();
        names.pollLast();
        
        System.out.println(names);
        
        //iterating through the array dequeue
        Iterator<String> iterator=names.iterator(); 
        while(iterator.hasNext()) { // check if iterator has the elements
        	System.out.print(" "+iterator.next()); // printing the element and move to next
        }
        
        System.out.println(""+names.getFirst());
        System.out.println(""+names.getLast());
        System.out.println(""+names.peekFirst());
        System.out.println(""+names.peekLast());
	}
}
