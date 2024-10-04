//this program is about implementation of multiple catch blocks
//A program to take input of number from user and dividing the existing array by it

package ExceptionHandling_topic;

//importing Scanner class
import java.util.Scanner;

//initial class
public class MultipleCatchBlockExample {

	public static void main(String[] args) {

		//crating object for scanner class
		Scanner sc=new Scanner(System.in);

		//initializing an array
		int[] numbers= {24,45,90,55};

		//Asking user to input a number through keyboard
		System.out.println("Enter any number :");
		int num1=sc.nextInt();  //storing entered number in num1 variable

		//closing the scanner class
		sc.close();

		// Try block to execute the code that may throw exceptions
		try {

			// Looping through the array to perform division
			for(int index=0;index<=numbers.length;index++) {

				System.out.println("On Dividing "+numbers[index]+" by "+num1);
				System.out.println("Quotient :"+(numbers[index]/num1));
				System.out.println("Reamainder :"+(numbers[index]/num1));
			}
		}

		// Catch block for handling ArrayIndexOutOfBoundsException
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("ARray must have index less than length"+ae);
		}

		// Catch block for handling ArithmeticException
		catch(ArithmeticException e) {
			System.out.println("Unable to divide a number by 0"+e);
		}

		// Generic catch block for handling any other exceptions
		//base class exception can also be provided in lower level which is not possible in mutiple exception in single catch
		catch(Exception e) {
			System.out.println("Exception :"+e);
		}
	}
}
