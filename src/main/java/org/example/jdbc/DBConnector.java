package org.example.jdbc;

import java.sql.*; 

public class DBConnector {

	public static void main(String[] args) {
		
		try
		{  
			 // Load the MySQL JDBC driver
			 String driverName = "com.mysql.cj.jdbc.Driver";
             Class.forName(driverName);
             // Create a connection to the database

             String serverName = "localhost";

             String schema = "test";  // Database name

             String url = "jdbc:mysql://" + serverName +  ":3306/" + schema;

             String username = "root"; // Your database username

             String password = "root"; // Your database password

             Connection con = DriverManager.getConnection(url, username, password);
			
			 System.out.println("Successfully Connected to the database!"); 
			
			 Statement stmt=con.createStatement();  
			
             // I created a table named "info" which consists of 3 columns which are roll no,
             // name and city respectively

			 // Create a result set
			 ResultSet rs=stmt.executeQuery("select * from info"); 
			
			 // Get result set metadata

			 ResultSetMetaData metadata = rs.getMetaData();

			 int columnCount = metadata.getColumnCount();


			// Get the column names; column indices start from 1

			for (int i=1; i<=columnCount; i++) {

			  String columnName = metadata.getColumnName(i);

			  System.out.print(columnName+"  ");

			}

			System.out.println("");		

			while(rs.next()) {
				 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
			}			    
			
			   con.close();  
			}
		   catch(Exception e)
		     { 
				System.out.println(e);
		     }  

	}

}

/*
 *  How to run the program? 
 *  
 *  Make sure you have a database named "test" created which consists of a table named "info"
 *  Table Schema: info(rollno int, name varchar(15), city varchar(10)) 
 *  Insert few entries in the tale
 *  Open terminal and change directory to current directory location and execute following commands
 * 
 *  1. javac DBConnector.java
 * 
 *  2. java -cp mysql-connector-java-8.0.30.jar; DBConnector
 * 
 *  ===================== OUTPUT =====================
 
    Successfully Connected to the database!
    rollno  name  city
    1  Adam  New york
    2  Bob  London
    3  David  New jersey
    4  Tim  Cape town
 
 * ====================================================
 */