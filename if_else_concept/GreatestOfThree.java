package if_else_concept;
import java.util.Scanner;

public class GreatestOfThree {
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
     	System.out.println("Enter 'a' value");
     	int a=sc.nextInt();
     	System.out.println("Enter 'b' value");
     	int b=sc.nextInt();
     	System.out.println("Enter 'c' value");
     	int c=sc.nextInt();
     	if(a>b)
     	{
     		if(a>c)
     		{
     			System.out.println(a+"is greater");
     		}
     		else 
     		{
     			System.out.println(c+" is greater");
     		}
     	}
     	else if(b>c)
     	{
     		System.out.println(b+"is greater");
     	}
     	else
     	{
     		System.out.println(c+"is greater");
     	}
     	sc.close();
     }
}

