//program on creating methods to store student data in a linked list
package collections_topic;

import java.util.*;

public class StudentOperation {

	//member variable of linked list type to store students
	private LinkedList<Student1> stdList;
	
	public StudentOperation() {
		stdList=new LinkedList();
	}
	
	//method for inputting student details through keyboard
	public void insertData() {
		//creating object for scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("----------Enter student details---------");
		System.out.print("Id :");
		String id=sc.nextLine();
		System.out.print("name :");
		String name=sc.nextLine();
		System.out.print("standard :");
		String standard=sc.nextLine();
		System.out.print("roll no :");
		int rollno=sc.nextInt();
		System.out.print("age :");
		int age=sc.nextInt();
	
		//creating object for student class
		Student1 student=new Student1(id,name,standard,rollno,age);
		
		stdList.add(student);
		System.out.println("Successfully inserted");
		System.out.println("-------------------------------");
	}
	
	//method for inputting student details at first through keyboard
	public void insertAtFirst() {
		//creating object for scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("----------Enter student details---------");
		System.out.print("Id :");
		String id=sc.nextLine();
		System.out.print("name :");
		String name=sc.nextLine();
		System.out.print("standard :");
		String standard=sc.nextLine();
		System.out.print("roll no :");
		int rollno=sc.nextInt();
		System.out.print("age :");
		int age=sc.nextInt();
	
		//creating object for student class
		Student1 student=new Student1(id,name,standard,rollno,age);
		
		stdList.addFirst(student);
		System.out.println("Successfully inserted");
		System.out.println("-----------------------------------");
	}
	
	//method for inputting student details at last through keyboard
	public void insertAtLast() {
		//creating object for scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------Enter Student Details----------");
		System.out.print("Id :");
		String id=sc.nextLine();
		System.out.print("name :");
		String name=sc.nextLine();
		System.out.print("standard :");
		String standard=sc.nextLine();
		System.out.println("roll no :");
		int rollno=sc.nextInt();
		System.out.print("age :");
		int age=sc.nextInt();
		
		//creating object for student class
		Student1 student=new Student1(id,name,standard,rollno,age);
		
		stdList.addLast(student);
		System.out.println("Successfully inserted");
		System.out.println("-----------------------------------");
	}
	
	//method to remove the data from first end
	public void removeFirstData() {
		if(stdList.isEmpty())
			System.out.println("List is empty");
		else {
		stdList.removeFirst();
		}
	}
	
	//method to remove the  data from last end
	public void removeLastData() {
		if(stdList.isEmpty())
			System.out.println("List is empty");
		else {
		stdList.removeLast();
		}
	}
	
	//method to get first student data
	public void getFirstData() {
		if(stdList.isEmpty())
			System.out.println("List is empty");
		else {
		System.out.println(""+stdList.getFirst());
		}
	}
	
	//method to get last student data
	public void getLastData() {
		if(stdList.isEmpty())
			System.out.println("List is empty");
		else {
		System.out.println(""+stdList.getLast());
		}
	}
	
	//method to display data
	public void displayData() {
		if(stdList.isEmpty())
			System.out.println("List is empty");
		else {
			Iterator<Student1> iterator=stdList.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}
}
