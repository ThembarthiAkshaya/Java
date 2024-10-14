//program on checking voting eligibility of a person using throws keyword
package ExceptionHandling_topic;

import java.util.Scanner;

/*---------Custom Exception----------*/
class AgeException extends Exception{
  
	/*----------constructor-------------*/
	public AgeException(String msg) {

		/*----calling constructor of base class----------*/
		super(msg);
	}
}

class Voter
{
	int age;
	/*-------Constructor----*/
	public Voter() {
		
		//creating object to scanner class
		Scanner sc=new Scanner(System.in);
		
		//Asking user to enter the age
		System.out.println("Enter your age(in year):");
		
		//holding age in a variable
		age=sc.nextInt();
		
		//closing scanner class
		sc.close();
	}
	
	/*----------method to check voting eligibility-------------*/
	public boolean isEligible() throws AgeException
	{
		//checking if the age is 18 or older
		if(age>=18)
		{
			return true;
		}
		
		//checking if the age is valid but less than 18
		else if(age>=0)
		{
			return false;
		}
		
		//if age is negative it will throw custom exception
		else
		{
			throw new AgeException("A person with negative age does not exist"); 
		}
	}
}

//initial class
public class ThrowsKeywordExample {
	
	public static void main(String[] args) {
		
		//creating object for voter class
		Voter voterobj=new Voter();
		
		//try block that may arise error
		try 
		{
		//checking if the voter is eligible to vote	
		boolean eligible=voterobj.isEligible();
		
		if(eligible) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
		}
		
		//catching custom exception
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
