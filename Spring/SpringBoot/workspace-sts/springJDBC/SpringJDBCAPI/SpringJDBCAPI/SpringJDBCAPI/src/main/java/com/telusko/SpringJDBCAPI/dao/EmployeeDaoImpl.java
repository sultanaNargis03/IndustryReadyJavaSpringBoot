package com.telusko.SpringJDBCAPI.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("empDao")
public class EmployeeDaoImpl implements IEmployeeDao 
{
	private static final String SQL_QUERY = "SELECT * FROM employee";
	List<Employee> empList=null;
			
	@Autowired
	private DataSource dataSource;
	
	public EmployeeDaoImpl()
	{
		System.out.println("EmployeeDaoimp bean created");
	}

	@Override
	public List<Employee> getTheEmployee() 
	{
		System.out.println("DataSource :"+ dataSource.getClass().getName());
		try
		{
			Connection connect = dataSource.getConnection();
			PreparedStatement pstmnt = connect.prepareStatement(SQL_QUERY);
			ResultSet rs = pstmnt.executeQuery();
			 empList = new ArrayList();
			 
//			 Integer id=rs.getInt(1);
//			 emp.setId(id);
//			 String city=rs.getNString(2);
//			 emp.setCity(city);
			 while(rs.next())
			 {
				 Employee emp=new Employee();
				 emp.setId(rs.getInt("id"));
				 emp.setCity(rs.getString("city"));
				 emp.setName(rs.getString("name"));
				 emp.setSalary(rs.getDouble("salary"));
				 empList.add(emp);
				 
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
	     
		return empList;
	}

}
