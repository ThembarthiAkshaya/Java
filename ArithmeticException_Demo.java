//program on arithmetic exception
package ExceptionHandling_topic;

public class ArithmeticException_Demo {

	public static void main(String[] args) {
		
		// Try block 
		try 
		{ 
			// Initializing variables
			int a = 30, b = 0;
			
			// Attempting to divide by zero, which will cause an exception
			int c = a/b;  // cannot divide by zero 
			
			System.out.println ("Result = " + c); 
		} 
		
		// Catch block to handle the ArithmeticException
		catch(ArithmeticException e) { 
			
			// Printing the exception message
			System.out .println(e);
			
		} 
	}
}
