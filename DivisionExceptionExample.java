/*----program on division by zero exception----*/

package ExceptionHandling_topic;

import java.util.Scanner;

public class DivisionExceptionExample {

	public static void main(String[] args) {
		//creating object for scanner class
		Scanner sc=new Scanner(System.in);

		//declaring two variables to store two numbers
		int num1,num2;

		//Asking the user to enter the two numbers from keyboard
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();

		//closing the scanner
		sc.close();

		try 
		{
			System.out.println("On dividing "+num1+" by "+num2+" : ");
			System.out.println("Quotient : "+(num1/num2));
			System.out.println("Quotient : "+(num1%num2));
		}
		
		//sending object e to the class Exception
		catch(Exception e) {
			System.out.println("Unable to divide a number by 0"+e);
		}
		System.out.println("------------task completed------------");
	}

}
