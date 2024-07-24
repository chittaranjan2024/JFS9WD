package app.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedure {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");) 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
			
			if(connection!=null)
			{
				System.out.println("Connection Successfull!");
			}
			
			CallableStatement callableStatement=connection.prepareCall("{call students()}");
			ResultSet resultSet= callableStatement.executeQuery();
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getString(1));
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
