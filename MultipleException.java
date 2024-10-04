//this program is about implementation of catch block which holds multiple exceptions
//A program to take input of number from user and dividing the existing array by it

package ExceptionHandling_topic;

//importing scanner class
import java.util.Scanner;

public class MultipleException {

	public static void main(String[] args) {
		// Creating object for Scanner class
		Scanner sc = new Scanner(System.in);

		// Initializing an array
		int[] numbers = {24, 45, 90, 55};

		//asking user to enter a number through keyboard
		System.out.println("Enter any number :");
		int num1 = sc.nextInt();  //storing entered a number through keyboard


		// Try block to execute the code that may throw exceptions
		try 
		{
			// Looping through the array to perform division
			for (int index = 0; index < numbers.length; index++) { // Corrected condition
				System.out.println("On Dividing " + numbers[index] + " by " + num1);
				System.out.println("Quotient :" + (numbers[index] / num1));
				System.out.println("Remainder :" + (numbers[index] % num1)); // Corrected remainder calculation
			}
		}        
		// Catch block to handle multiple exceptions: ArrayIndexOutOfBoundsException and ArithmeticException
		catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) { // Corrected exception name
			System.err.println("Exception occurred: " + exception);
		}

		System.out.println("===========================================");
		sc.close(); // Closing the scanner
	}
}
