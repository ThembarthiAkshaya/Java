package collections_topic;

import java.util.*;

public class ArrayList_demo {
public static void main(String args[]) {
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
    list.add("Mango");//Adding object in array list    
    list.add("Apple");    
    list.add("Banana");    
    list.add("Grapes");   
    
    //Printing the array list object   
    System.out.println(list);  
    
  //Traversing list through Iterator  
    Iterator itr=list.iterator();
    
    //getting the Iterator  
    while(itr.hasNext()){//check if iterator has the elements
    	   System.out.println(itr.next());//printing the element and move to next  
    }  
}
}
