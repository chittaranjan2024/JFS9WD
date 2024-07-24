package app.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsertion {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");) 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			if(connection!=null)
			{
				System.out.println("Connection Successfull!");
			}
		
			Statement statement=connection.createStatement();
			statement.addBatch("insert into student values(678,'Harish','Kolkata')");
			statement.addBatch("insert into student values(987,'Kunal','Hyderabad')");
			statement.addBatch("insert into student values(456,'Priyanka','Mumbai')");
			
			
			if(statement.executeBatch().length>0)
			{
				System.out.println("Batch execution completed!!");
			}
			else
			{
				System.out.println("Batch execution failed!!");
			}
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			
			   System.out.println(e.getMessage());

		}
		catch (Exception e) {
		   System.out.println(e.getMessage());
		}
		


	}

}
