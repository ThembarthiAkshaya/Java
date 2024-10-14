//Java program to demonstrate ArrayIndexOutOfBoundException
package ExceptionHandling_topic;
 
public class ArrayIndexOutOfbound_demo {

	public static void main(String[] args) {
		       //try block
				try
				{ 
					//declaring an array 'a' with the length 5
					int a[] = new int[5]; 
					
					a[6] = 9; // accessing 7th element in an array of  size 5 ,which will cause an error
							
				}
				
				// Catch block to handle the ArrayIndexOutOfBoundException
				catch(ArrayIndexOutOfBoundsException e){ 
					System.out.println ("Array Index is Out Of Bounds"); 
				}
		}  
}
