/*----------program on division of two numbers by using try-with-resource-----------*/
package ExceptionHandling_topic;

//importing scanner class
import java.util.Scanner;

public class TryWithResourceExample {

	public static void main(String[] args) {
				//declaring two variables to store two numbers
				int num1,num2;

				// Try block to execute the code that may throw exceptions
				try(Scanner sc=new Scanner(System.in);) 
				{
					//Asking the user to enter the two numbers from keyboard
					System.out.print("Enter first number: ");
					num1=sc.nextInt();
					System.out.print("Enter second number: ");
					num2=sc.nextInt();
					System.out.println("On dividing "+num1+" by "+num2+" : ");
					System.out.println("Quotient : "+(num1/num2));
					System.out.println("Remainder : "+(num1%num2));
					System.out.println("----------------------------------------");
				}

				// Catch block for handling ArithmeticException
				//sending object e to the class Arithmetic Exception
				catch(ArithmeticException e) {
					System.out.println("Unable to divide a number by 0 "+e);
				}
				System.out.println("------------task completed------------");

	}

}
