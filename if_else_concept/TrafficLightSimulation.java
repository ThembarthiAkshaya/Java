package if_else_concept;

//importing Scanner class
import java.util.Scanner;

public class TrafficLightSimulation {

	public static void main(String[] args) {
		//creating object for scanner class
		Scanner sc=new Scanner(System.in);
		
		//declaring member variable
		String color;
		
		//asking user to enter a color through input
		System.out.println("Enter a color:");
		color=sc.nextLine();
		
		color.toLowerCase();
		
		//switch statements to decide action
		switch(color) {
		case "Red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Prepare to stop");
			break;
		case "green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid Color");
		}
	}
}
