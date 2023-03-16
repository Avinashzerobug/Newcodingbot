package com.space.app.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connObject = DriverManager.getConnection("jdbc:mysql://Localhost:3306/space_station","root","Avinash42464225");
			
			String insetQuery = "insert into space_table values (0,'Yash','India',6,'Michael Collins',4576)";
			Statement statement = connObject.createStatement();
			
			int rowsAffected = statement.executeUpdate(insetQuery);
			System.out.println("Rows are  effected"+ rowsAffected);
			String deleteQuery="delete from space_table where s_id=10";
			String updateQuery="update space_table set s_name='Thanosia' WHERE s_id=6";
			
			int rowsAffected2 = statement.executeUpdate(updateQuery);
			int rowsAffected1 = statement.executeUpdate(deleteQuery);
			
			System.out.println("rowsAffected " + rowsAffected);
			connObject.close();
		} catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException problem loading driver,class anem is wrong " + e.getMessage());
		} catch (SQLException e) {
			System.err.println(
					"SQLException connecting to database,either URL,UserName,Password is wrong " + e.getMessage());	
		
		}
		}	
		
	}


