package com.industrystd.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.industrystd.util.JDBCUtility;

public class LaunchAll {

	public static void main(String[] args) 
	{
		//Resource
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try
		{
			connect=JDBCUtility.getDBConnection();
			if(connect!=null)
				stmt=connect.createStatement();
			if(stmt!=null)
			{
				//boolean status=stmt.execute("UPDATE studentdetail set age=24 where id=1");
				boolean status=stmt.execute("SELECT * FROM studentdetail");
				if(status)
				{
					//ResultSet
					rs=stmt.getResultSet();
					System.out.println("Write resultset implementation code");
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
				else
				{
					//now of rows affected
					
					int rowAffected=stmt.getUpdateCount();
					if(rowAffected!=0)
						
						System.out.println("successfully updated!! row affected: "+rowAffected);
					else
						
						System.out.println("failed to update!! row affected: "+rowAffected);
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
				JDBCUtility.closeResource(connect, stmt, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}