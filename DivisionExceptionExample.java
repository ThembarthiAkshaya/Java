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
		System.out.print("Enter first number: ");
		num1=sc.nextInt();
		System.out.print("Enter second number: ");
		num2=sc.nextInt();

		
		try 
		{
			System.out.println("On dividing "+num1+" by "+num2+" : ");
			System.out.println("Quotient : "+(num1/num2));
			System.out.println("Remainder : "+(num1%num2));
			System.out.println("----------------------------------------");
		}
		
		//sending object e to the class Exception
		catch(ArithmeticException e) {
			System.out.println("Unable to divide a number by 0"+e);
		}
		finally{
			System.out.println("--------finally block---------------");
			sc.close();
			System.out.println("------------------------------------");
		}
		System.out.println("------------task completed------------");
	}

}
