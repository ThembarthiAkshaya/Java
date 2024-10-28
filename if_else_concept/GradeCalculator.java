package if_else_concept;

//importing scanner class
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		//creating object for scanner class
		Scanner sc=new Scanner(System.in);
		
		//Declaring member variable 
		int score;
		
		//asking user to enter the score of the student
		System.out.println("Enter the score(0-100) :");
		score=sc.nextInt();
		
		//check whether the score is between 90-100
		if(score>=90 && score<=100) {
			System.out.println("A Grade");
		}
		
		//check whether the score is between 80-89
		else if(score>=80 && score<=89) {
			System.out.println("B Grade");
		}
		
		//check whether the score is between 70-79
		else if(score>=70 && score<=79) {
			System.out.println("C Grade");
		}
		
		//check whether the score is between 60-69
		else if(score>=60 && score<=69) {
			System.out.println("D Grade");
		}
		
		//check whether score is less than 60 
		else {
			System.out.println("F Grade");
		}
	}
}
