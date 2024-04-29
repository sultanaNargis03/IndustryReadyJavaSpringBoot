package com.telusko.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.telusko.jdbc.util.JdbcUtility;

public class LaunchJDBCFetch {

	public static void main(String[] args) throws SQLException 
	{

		Connection connect=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		Scanner sc=null;
		try 
		{
			connect=JdbcUtility.getDBConnection();
			if(connect!=null)
			{
				String query="SELECT * FROM studentdetail where id=?";
				stmt=connect.prepareStatement(query);
				if(stmt!=null)
				{
					System.out.println("welcome");
					sc=new Scanner(System.in);
					System.out.println("Please enter your id");
					Integer id=sc.nextInt();
					stmt.setInt(1, id);
					rs=stmt.executeQuery();
					if(rs!=null)
					{
						System.out.println("ID\tNAME\tAGE\tGENDER");
						
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+
									"\t"+rs.getInt(3)+"\t"+rs.getString(4));
						}
					}
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
			JdbcUtility.closeResource(connect, stmt, rs);
		}

	}

}