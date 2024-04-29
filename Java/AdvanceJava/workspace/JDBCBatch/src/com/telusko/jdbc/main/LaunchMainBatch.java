package com.telusko.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.telusko.jdbc.util.JdbcUtility;

public class LaunchMainBatch {

	public static void main(String[] args)
	{
		Connection connect=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		
		try
		{
			connect=JdbcUtility.getDBConnection();
			if(connect!=null)
			{
				String query="UPDATE studentdetail set name=? where id=?";
				stmt=connect.prepareStatement(query);
				
				if(stmt!=null)
				{
					
					stmt.setString(1, "Nargis");
					stmt.setInt(2, 1);
					stmt.addBatch();
					
					stmt.setString(1, "Nargis2");
					stmt.setInt(2, 2);
					stmt.addBatch();
					
					stmt.setString(1, "Nargis3");
					stmt.setInt(2, 3);
					stmt.addBatch();
					
					int arr[]=stmt.executeBatch();
					System.out.println("check db for update");
				}
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				JdbcUtility.closeResource(connect, stmt, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
