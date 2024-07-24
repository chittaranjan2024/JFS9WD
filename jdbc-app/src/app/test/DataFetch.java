package app.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataFetch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");) 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			if(connection!=null)
			{
				System.out.println("Connection Successfull!");
			}
			
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from student");
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
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
