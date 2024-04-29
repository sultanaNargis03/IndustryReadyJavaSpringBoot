package com.telusko.jdbc.main;
import java.sql.*;

import com.telusko.jdbc.util.JdbcUtility;
public class LaunchJDBCAll
{

	public static void main(String[] args) 
	{
		
		//Resource 
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try
		{
			connect=JdbcUtility.getDBConnection();
			if(connect!=null)
				stmt=connect.createStatement();
//			if(stmt!=null)
//				rs=stmt.executeQuery("Select * from studentdetail");
//			if(rs!=null)
//			{
//				System.out.println("ID\tNAME\tAGE\tGENDER");
//				
//				while(rs.next())
//				{
//					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+
//							rs.getInt(3)+"\t"+rs.getString(4));
//					//Integer i=rs.getInt(1);
//				}
//			}
			stmt=connect.createStatement();
			if(stmt!=null)
			{
				//boolean status=stmt.execute("UPDATE studentdetail set age=25 where id=1");
				boolean status=stmt.execute("Select * from studentdetail");
				
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
					int rowsAffected=stmt.getUpdateCount();
					System.out.println(rowsAffected);
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
