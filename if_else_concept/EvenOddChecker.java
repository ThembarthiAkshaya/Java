package if_else_concept;

//importing Scanner class
import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// creating a variable to store number
		int number;

		/*--inputing data through keyboard-- */
		System.out.println("Enter a number:");
		number = sc.nextInt();

		//condition to check whether the number is even or odd
		if (number % 2 == 0) 
			System.out.println(number + " is Even number");
		 else 
			System.out.println(number + " is Odd number");
		
		//Closing scanner class
		sc.close();
	}
}
