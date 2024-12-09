package com.databasemanagement.schoolmanagement;
import java.sql.*;
public class StudentInsertion {

	public static void main(String[] args) {
		try{
			//register my sql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//to create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshaya","root","Akshaya8313*");
			//to create statement
			Statement stmt=con.createStatement();
			//executing insert query
			int i=stmt.executeUpdate("insert into student values('std01','akshaya')");
			if(i>0) {
				System.out.println("Successfullt inserted into table");

			}
			else {

				System.out.println("Unable to insert data into table");
			}
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
