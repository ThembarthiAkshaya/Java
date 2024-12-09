package com.studentmanagement.studentcrudapp.dao;
import java.sql.*;
import com.databaseamanagement.studentcrudapp.entities.*;
public class StudentDAO {
public int insertStudent(Connection conObj,Student student)
{
	int row=0;
	try {
	if(conObj!=null)
	{
		//creating prepared statement
		PreparedStatement stmt=conObj.prepareStatement("insert into student values(?,?,?,?,?,?)");
		
		//This method is used to set a String value to the first ? placeholder in the SQL query.
		stmt.setString(1,student.getStdid());
		stmt.setString(2,student.getStdName());
		stmt.setString(3,student.getStandard());
		stmt.setInt(4,student.getRoll());
		stmt.setInt(5,student.getAge());
		stmt.setString(6,student.getAddress());
		
		//to execute query for inserting
		row=stmt.executeUpdate();
		return row;
	}
	else {
		
	}
	}
	catch(SQLException se) {
		System.out.println(se);
		
	}
}
}
