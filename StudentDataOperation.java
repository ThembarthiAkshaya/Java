package collections_topic;

import java.util.*;

public class StudentDataOperation {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc=new Scanner(System.in);

		//creating object for student1 class
		StudentOperation student=new StudentOperation();
		
		int choice;
		
		do {
			System.out.println("Asking user to select any one of the following operation");
			System.out.println("1.insert the data");
			System.out.println("2.insert the data at frist");
			System.out.println("3.insert the data at last");
			System.out.println("4.remove data at first end");
			System.out.println("5.remove data at last end");
			System.out.println("6.to get first data ");
			System.out.println("7.To get last data");
			System.out.println("8.To display data");
			int operation=sc.nextInt();

			switch(operation) {
			case 1:student.insertData();
			break;
			case 2:student.insertAtFirst();
			break;
			case 3:student.insertAtLast();
			break;
			case 4:student.removeFirstData();
			break;
			case 5:student.removeLastData();
			break;
			case 6:student.getFirstData();
			break;
			case 7:student.getLastData();
			break;
			case 8:student.displayData();
			break;
			default:System.out.println("Invalid operation");
			}
			System.out.println("Press O to exit or other number to continue");
			choice=sc.nextInt();
			System.out.println("---------------------------------------");
		}while(choice!=0);
		
	}
}
