package collections_topic;
import java.util.*;
public class StackImplementation {

	public static void main(String[] args) {
		// create a stack of the name of states of india 
		//as class having states we have used string generic class as string
		Stack<String> stateName=new Stack<>();
		
		//insertion of data
		//we are using push rather that we don't use because it's stack data structure
		stateName.push("AndhraPradesh");
		stateName.push("Delhi");
		stateName.push("Rajasthan");
		stateName.add(2,"UP"); //due to this it is not preferrable to use stack class,it is behaving like list only not as stack 
		
		System.out.println("Stack is :"+stateName);
		//element of top position
		System.out.println("Element at top :"+stateName.peek());
	}

}
