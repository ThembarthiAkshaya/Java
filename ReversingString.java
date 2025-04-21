//program to reverse a string if we encounter a space while iterating through the string we have to stop the process and print the output
//eg:string:hello world and output:olleh
package stringtopic;

//importing scanner class
import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args)
	{
		//creating object for scanner class
		Scanner sc=new Scanner(System.in);
		
		//declaring two strings
		String s1,s2;
		
		//declaring a variable to hold the result
		String newString="";
		String reverse="";	
		//asking the user to input a string through keyboard
		s1=sc.nextLine();
		
		//removing the space before and last of the entered string
		s2=s1.trim();
		
		//a loop to iterate through the character of a string
		for(int i=0;i<s1.length()-1;i++) 
		{
			//checking whether the character is space or not
			if(s2.charAt(i)==' ')
				break;
			else
				newString+=s2.charAt(i);
		}
		for(int i=newString.length()-1;i>=0;i--)
		{
			reverse+=newString.charAt(i);
		}
		System.out.println(""+reverse);
		
		//closing the scanner class
		sc.close();
	}

}
