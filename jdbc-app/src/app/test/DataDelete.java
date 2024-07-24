package app.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataDelete {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");) 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			if(connection!=null)
			{
				System.out.println("Connection Successfull!");
			}
		
	 PreparedStatement preparedStatement=connection.prepareStatement("delete from student where id=?");
	 System.out.println("Enter id:");
	 preparedStatement.setInt(1, scanner.nextInt());

	 if(preparedStatement.executeUpdate()>0)
	 {
		 System.out.println("record deleted!!");
	 }
	 else
	 {
		 System.out.println("id not found");
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
