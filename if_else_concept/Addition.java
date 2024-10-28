//adding two numbers when first number is less than second number

package if_else_concept;

import java.util.*;

public class Addition {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// creating two variables to store two numbers
		int num1, num2;

		/*--inputing data through keyboard-- */
		System.out.print("Enter first number:");
		num1 = sc.nextInt();
		System.out.print("Enter second number:");
		num2 = sc.nextInt();

		/*---displaying the data---*/
		System.out.println("First no:" + num1);
		System.out.println("Second no:" + num2);
		if (num1 < num2)
			System.out.println("Addition=" + (num1 + num2));
		sc.close();
	}

}
