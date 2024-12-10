//rotate an array left by number of given positions
package Example;

import java.util.Scanner;

public class RotatingArray {

	public static void main(String[] args) {
		//creating object for scanner class
		Scanner sc=new Scanner(System.in);
		
		//declaring an array
		int numbers[];
		
		System.out.println("Enter the length of the array:");
		int size=sc.nextInt();
		
		numbers=new int[size];
		
		//taking the input from the user
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=sc.nextInt();
		}
		
		//displaying array
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+"");
		}
		
		System.out.println("Enter the number of positions:");
		
		//asking user to enter the number of positions
		int positions=sc.nextInt();
		
		//declaring the temporary array
		int temp[]=new int[size];
		
		positions=positions%size;
		
		//performing left rotation
		for (int i = 0; i < size; i++) {
            temp[i] = numbers[(i + positions) % size];  // Calculate new index
        }
		
		//printing rotated array
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]);
		}
	}
}
