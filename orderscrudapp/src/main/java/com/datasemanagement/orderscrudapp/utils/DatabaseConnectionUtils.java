/*---------- It is designed to be reusable across the project and helps in centralizing
 the logic for establishing and closing database connections. -----*/
package com.datasemanagement.orderscrudapp.utils;

import java.sql.*;

public class DatabaseConnectionUtils {
	
		private static Connection connection=null;
		
		//Static Block for Connection Initialization:
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
		
		/*------------Method to return connection------------*/
		//this method to get the active database connection and interact with the database.
		public static Connection getConnection()
		{
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
