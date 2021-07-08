package com.revature.three_database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
	
	//connects to the project 1 AWS RDS
	public static Connection getConnection() throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println("Class not found");
			e.printStackTrace();
		}
		
		String url = System.getenv("urlP1");
		
		return DriverManager.getConnection(url);
	}
	
	//method for testing connection
//	public static void main(String[] args) {
//		//here we're just testing whether our connection (from the ConnectionUtil Class) is successful
//		//remember - the getConnection() method will return a Connection object if you successfully reach the database
//		try(Connection conn = DatabaseManager.getConnection()) {
//			System.out.println("connection successful");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
}
