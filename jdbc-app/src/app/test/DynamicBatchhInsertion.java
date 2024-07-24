package app.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DynamicBatchhInsertion {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");) 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
			
			if(connection!=null)
			{
				System.out.println("Connection Successfull!");
			}
			
			System.out.println("Number of queries:");
			int n=Integer.parseInt(bufferedReader.readLine());
			PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?)");

			for(int i=1;i<=n;i++)
			{
				System.out.println("Enter id:");
				int id=Integer.parseInt(bufferedReader.readLine());
				
				System.out.println("Enter name:");
				String name=bufferedReader.readLine();
				 
				System.out.println("Enter city:");
				String city=bufferedReader.readLine(); 

				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, city);
				
				preparedStatement.addBatch();
			}
			
			if(preparedStatement.executeBatch().length>0)
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
