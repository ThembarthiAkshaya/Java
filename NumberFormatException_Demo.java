//program on number format exception
package ExceptionHandling_topic;

public class NumberFormatException_Demo {

	public static void main(String[] args) {
		// Try block
		try { 
			// Attempting to parse a non-numeric string "akki" to an integer
			// "akki" is not a number 
			int num = Integer.parseInt ("akki") ; 

			System.out.println(num); 
		} 
		
		// Catch block to handle the NumberFormatException
		catch(NumberFormatException e) { 
			System.out.println("Number format exception"); 
		} 
	}
}
