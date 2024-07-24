package app.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnectivity {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");) 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			if(connection!=null)
			{
				System.out.println("Connection Successfull!");
			}
			
			PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?)");
			System.out.println("Enter id:");
			preparedStatement.setInt(1, scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter name:");
			preparedStatement.setString(2, scanner.nextLine());
			
			System.out.println("Enter city:");
			preparedStatement.setString(3, scanner.nextLine());
			
			int afftectedRows=preparedStatement.executeUpdate();
			if(afftectedRows>0)
			{
				System.out.println("Record inserted!!");
			}
			else
			{
				System.out.println("Problem in insertion!!");
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
;