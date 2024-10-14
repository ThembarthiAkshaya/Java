//program on voting eligibility
package ExceptionHandling_topic;

import java.util.Scanner;
/*---------------------Custom Exception----------------------*/
class AgeException extends Exception{

	/*----------constructor-------------*/
	public AgeException(String msg) {

		/*----calling constructor of base class----------*/
		super(msg);
	}
}
public class VotingEligibilityCheck {

	public static void main(String[] args) {
        // Declare member variable for age
		int age;

		// Try-with-resources for automatic resource management of Scanner
		try(Scanner sc=new Scanner(System.in)){
            /*---------input of age through keyboard--------*/
			System.out.print("Enter age of person(in year) :");

			age=sc.nextInt();
			
			// Check if age is 18 or older for voting eligibility
			if(age>=18)
				System.out.println("Eligible for voting  ");
			else if(age>=0)
				System.out.println("Not eligible for voting");
			else
			{
				 // Throw custom exception if age is negative
				throw new AgeException("Negative age is Invalid :");
			}
		}
		catch(AgeException ageexception) {
			// Handle custom AgeException
			System.out.println(ageexception);
		}
	}
}
