/*program to check whether the angles form a triangle or not*/

package if_else_concept;

//importing scanner class
import java.util.*;

public class Triangle {

	// creating main method
	public static void main(String args[]) {

		// creating an object to scanner class
		Scanner sc = new Scanner(System.in);

		// taking input from user through keyboard
		System.out.println("Enter three angles:");

		//initializing three variables to hold three angles
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//closing scanner class
		sc.close();

		//checking whether three angles forms triangle or not
		if ((a + b + c) == 180)  //if three sum of the three angles equal to 180 they will form a triangle
			System.out.println("Entered angles can form a triangle");
		else
			System.out.println("Entered angles cannot form a triangle");
	}
}
