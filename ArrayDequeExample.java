package collections_topic;

//importing util package
import java.util.*;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		/*----array dequeue of integers-----*/
		ArrayDeque<Integer> numbers=new ArrayDeque<Integer>();
		
		//inserting numbers at front end
		numbers.addFirst(24);
		numbers.addFirst(34); //it will shifted to right side
		numbers.addFirst(45);
		numbers.offerFirst(54);
		numbers.offerFirst(47);
		numbers.offerLast(47);
		numbers.removeLast();
		numbers.removeFirst();
		numbers.offerLast(56);
		numbers.offerFirst(6);
		
        Iterator<Integer> iterator=numbers.iterator();
        while(iterator.hasNext()) {
        	System.out.print(iterator.next()+" ");
        }
        
        System.out.println("\n"+numbers.getFirst());
        System.out.println(""+numbers.peekFirst());
        System.out.println(""+numbers.peekLast());
        System.out.println(""+numbers.pollFirst());
        System.out.println(""+numbers.getLast());
        System.out.println(""+numbers.getFirst());
        System.out.println(""+numbers.pollLast());
        Iterator<Integer> iterator2=numbers.iterator();
        while(iterator2.hasNext()) {
        	System.out.print(iterator2.next()+" ");
        }
	}

}
