//program on leap year

package if_else_concept;

import java.util.*;

public class LeapYear {
	// creating main method
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		// taking input from user
		int year = sc.nextInt();
		sc.close();
		if ((year % 4 == 0) || (year % 400 == 0) || (year % 100 != 0)) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " Not leap year");
		}
	}
}
/*---logic
if(year%100==0) {
	if(year%400==0)
		System.out.println("Leap year");
	else
		System.out.println("Not leap year");
}
else
{
	if(year%4==0)
		System.out.println("Leap year");
	else
		System.out.println("Not leap year";)
}
-------*/