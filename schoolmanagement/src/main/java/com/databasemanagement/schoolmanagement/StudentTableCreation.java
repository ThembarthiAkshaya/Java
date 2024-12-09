package com.databasemanagement.schoolmanagement;
import java.sql.*;
public class StudentTableCreation {
public static void main(String args[]) {
	try {
		//register my sql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//to establish connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshaya","root","Akshaya8313*");
		
		//to create a statement for table creation
		Statement stmt=con.createStatement();
		
		//to execute query for table creation
		stmt.execute("create table student(stdid varchar(30) primary key,stdname varchar(400) not null)");
		
		System.out.println("Table created");
		
		//to close the connection
		con.close();
	}
	catch(ClassNotFoundException ce) {
		System.out.println(ce);
	}
	catch(SQLException se) {
		System.out.println(se);
	}
}
}
