//program on displaying maximum value in a vector
package collections_topic;

//importing util package
import java.util.*;

public class MaxValueInVector {

	public static void main(String[] args) {
		//creating vector
	    Vector<Integer> numbers=new Vector();
	    
	    //creating object for scanner class
	    Scanner sc=new Scanner(System.in);
	    
	    //asking user to enter the 15 numbers through keyboard
	    System.out.println("Enter 15 numbers :");
	    
	    for(int i=0;i<15;i++) {
	    	numbers.add(sc.nextInt());
	    }
	    
	    //closing the scanner class
	    sc.close();
	    
	    //Displaying the vector
	    System.out.println("Vector is:"+numbers);
	    
	    //initializing maximum number as first value in the vector
	    int maxnumber=numbers.get(0);
	   
	    //creating iterator
	   Iterator<Integer> number=numbers.iterator();
	   
	   //iterating through the vector
	   while(number.hasNext()) {
		   if(maxnumber<number.next()) {
			   maxnumber=number.next();
		   }
	   }
	   
	   //displaying largest number
	   System.out.println("highest number is:"+maxnumber);
	}
}
