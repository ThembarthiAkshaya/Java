/*----------Writing program to calculate simple interest. Also using exception handling-------------*/
package ExceptionHandling_topic;

//importing scanner class
import java.util.Scanner;
/*------------------------------------------------------*/
/*----------custom exception class for principle-----------*/
class PrincipleException extends Exception{
	//constructor
	public PrincipleException(String message) {
		super(message);
	}
}
/*------------------------------------------------------*/
/*----------custom exception class for rate-----------*/
class RateException extends Exception{
	/*-----------constructor--------*/
	public RateException(String message) {
		super(message);
	}
}
/*------------------------------------------------------*/
/*----------custom exception class for time-----------*/
class TimeException extends Exception{
	/*-----------constructor--------*/
	public TimeException(String message) {
		super(message);
	}
}
/*------------------------------------------------------*/
/*-----------defining interest class---------*/
class Interest{
	/*-------------Member variables--------------*/
	float principle;
	float rate;
	int time;

	/*----------constructor---------*/
	public Interest() {
		
		/*--------scanner class object---------*/
		Scanner sc=new Scanner(System.in);
		
		//asking user to enter the principle through keyboard
		System.out.println("Enter principle :");
		principle=sc.nextFloat();
		
		//asking user to input rate through keyboard
		System.out.println("Enter rate(%) :");
		rate=sc.nextFloat();
		
		//asking user to input time through keyboard
		System.out.println("Enter time(in year) :");
		time=sc.nextInt();
		System.out.println("----------------------------------");
	}
	
	//Method to display data
	private void displayInfo() {
		System.out.println("Principle  :"+principle);
		System.out.println("Rate  :"+rate);
		System.out.println("Time  :"+time);
	}
	
	/*---------method for calculating simple interest---------*/
	public void calculateSimpleInterest() {
		try {
			//checks all input values are valid and throw exception if negative
			if(principle<0) {
				throw new PrincipleException("Principle cannot be negative");
			}
			else if(rate<0) {
				throw new RateException("Rate cannot be negative");
			}
			else if(time<0) {
				throw new TimeException("Time cannot be negative");
			}
			//calculate simple interest if all input values are valid
			else {
				
				//formula to calculate simple interest
				float simpleinterest=(principle*rate*time)/100;
				
				//calling displaying information method
                displayInfo();
                
                //displaying simple interest
				System.out.println("Simple interest is: "+simpleinterest);
			}
		}
		catch(PrincipleException | RateException | TimeException  exception) {
			//handle exception by printing the message
			System.out.println(exception);
		}
	}

}
/*---------------------------------------------------------*/
//initial class
public class InterestCalculator {

	public static void main(String[] args) {
		/*---- Object of Interest --*/
		Interest i=new Interest();
		i.calculateSimpleInterest();
	}

}
