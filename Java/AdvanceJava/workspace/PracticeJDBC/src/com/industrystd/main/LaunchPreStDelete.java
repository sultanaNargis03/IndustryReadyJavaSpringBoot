package com.industrystd.main;

import java.sql.*;
import java.util.Scanner;

import com.industrystd.util.JDBCUtility;



public class LaunchPreStDelete {

	public static void main(String[] args) 
	{
		Connection connect=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		Scanner sc=null;
		
		try
		{
			connect=JDBCUtility.getDBConnection();
			if(connect!=null)
			{
				String query="DELETE from studentdetail where id=?";
				stmt=connect.prepareStatement(query);
			
				if(stmt!=null)
				{
					System.out.println("welcome");
					sc=new Scanner(System.in);
					System.out.println("Please enter your id");
					Integer id=sc.nextInt();
					stmt.setInt(1, id);
					
					int rowAffected=stmt.executeUpdate();
					if(rowAffected!=0)
						System.out.println("deleted successfull");
					else
						System.out.println("failed to delete");
				}
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				JDBCUtility.closeResource(connect, stmt, rs);
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		
	}

}
