package app.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.xdevapi.Type;

public class MySQLFunction {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");) 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
			
			if(connection!=null)
			{
				System.out.println("Connection Successfull!");
			}
			
			CallableStatement callableStatement=connection.prepareCall("{?=call checkValidId(?)}");
			callableStatement.setInt(2, -234);
			callableStatement.registerOutParameter(1, Types.VARCHAR);
			callableStatement.execute();
			
			System.out.println(callableStatement.getString(1));
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			
			   System.out.println(e.getMessage());

		}
		catch (Exception e) {
		   System.out.println(e.getMessage());
		}


	}

}
