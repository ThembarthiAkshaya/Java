package com.databasemanagement.studentcrudapp.utils;
import java.sql.*;
public class DatabaseConnectionUtils 
{
	private static Connection connection=null;
	static
	{
		try 
		{
			/*----register driver fro my sql-----------*/
			Class.forName("com.mysql.cj.jdbc.Driver");

			/*creating variable required for establishing a connection with my sql database*/
			String url="jdbc:mysql://localhost:3306/studentmangement";
			String username="root";
			String password="Akshaya8313*";

			//creating connection
			connection=DriverManager.getConnection(url,username,password);

		}
		catch(ClassNotFoundException ce) {
			System.out.println("Driver not found");
		}
		catch(SQLException se) {
			System.out.println(se);
		}
	}
	/*----------------------------------------------------*/
	/*------------Method to return connection------------*/
	public static Connection getConnection() {
		return connection;
	}

	/*-----------method to close the connection-------------*/
	public static void closeConnection() {

		try{
			if(connection!=null) {
			}
			connection.close();
		}
		catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}

























