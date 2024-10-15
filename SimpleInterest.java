/*------------program on simple intrest.Also using Exception handling(using throws keyword)-------------*/

package ExceptionHandling_topic;

//importing Scanner class
import java.util.Scanner;

/*--------custom exception for principle---------*/
class PrincipleException1 extends Exception{
	public PrincipleException1(String message) {
		super(message);
	}
}

/*--------custom exception for time---------*/
class TimeException1 extends Exception{
	public TimeException1(String message) {
		super(message);
	}
}

/*--------custom exception for rate of interest---------*/
class RateOfInterestException1 extends Exception{
	public RateOfInterestException1(String message) {
		super(message);
	}
}


class SimpleInterestCalculator{
	/*------------member variables---------------*/
	int principle;
	int time;
	int rateOfInterest;

	/*--------------constructor-------------*/
	public SimpleInterestCalculator(){

		//creating object for scanner class
		Scanner sc=new Scanner(System.in);

		//Asking the user to enter the amount through keyboard
		System.out.println("Enter principle amount :");
		principle=sc.nextInt();

		//Asking the user to enter time through keyboard
		System.out.println("Enter time(in years) :");
		time=sc.nextInt();

		//Asking user to enter rate of interest through keyboard
		System.out.println("Enter rate of interest :");
		rateOfInterest=sc.nextInt();
	}

	/*---------------method for display the data----------------*/
	public void displayData() {
		System.out.println("----------------------------------------");
		System.out.println("Principle amount is :"+principle);
		System.out.println("Time :"+time);
		System.out.println("Rate of interest is :"+rateOfInterest);
	}

	/*---------------method for calculating simple interest---------------*/
	public void calculateSimpleInterest() throws PrincipleException1,TimeException1,RateOfInterestException1{

		//checks all input values are valid and throw exception if negative
		if(principle<0) {
			throw new PrincipleException1("principle should be greater than zero");
		}
		else if(time<0) {
			throw new TimeException1("time should be greater than zero");
		}
		else if(rateOfInterest<0) {
			throw new RateOfInterestException1("rate of interest should be greater than zero");
		}

		//calculate simple interest if all input values are valid
		else {
			float simpleInterest=(principle*time*rateOfInterest)/100;
			System.out.println("Simple interest is:"+simpleInterest);
		}
	}
}
/*--------------------------------------------------------------------*/
//initial class
public class SimpleInterest {

	public static void main(String args[]) {

		//creating object for simple interest calculator class
		SimpleInterestCalculator s=new SimpleInterestCalculator();

		//calling the display data method
		s.displayData();

		//try block
		try {
			//calling calculate Simple interest method
			s.calculateSimpleInterest();
		}

		//catch block to handle the exception by printing the message
		catch(Exception e) {
			System.out.println(e);
		}
	}
}