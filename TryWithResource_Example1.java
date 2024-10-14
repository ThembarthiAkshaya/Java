package ExceptionHandling_topic;

//importing FileOutputDtream class
import java.io.FileOutputStream;

public class TryWithResource_Example1 {

	public static void main(String[] args) {
		// Using try-with-resources  
		try(FileOutputStream fileOutputStream =new FileOutputStream("C:\\Akshaya\\links.txt")){      
		
	    // Message to be written to the file
		String msg = "Welcome to java classes!";   
		
		byte byteArray[] = msg.getBytes(); //converting string into byte array  
		
		// Writing the byte array to the file
		fileOutputStream.write(byteArray);  
		
		System.out.println("Message written to file successfuly!");
		}
		// Catching any exceptions that may occur during file operations
		catch(Exception exception){  
		       System.out.println(exception);  
		}      
  }
}
