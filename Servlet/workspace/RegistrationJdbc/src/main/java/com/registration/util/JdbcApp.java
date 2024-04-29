package com.registration.util;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lombok.Data;

public class JdbcApp 
{
	private Integer id;
	private String vaccineName;
	private String vaccineCompany;
	private int cost;
	private int row;
	
	String query="INSERT INTO vaccinedetails (id,vaccinename,vaccinecompany,price)"
			+ "VALUES(?,?,?,?)";
	Connection connect=null;
	PreparedStatement pstmt=null;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public String getVaccineCompany() {
		return vaccineCompany;
	}
	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public void jdbcRegister()
	{
		
	
	try 
	{
		connect=JdbcUtility.getDbConnection();
		if(connect!=null)
			pstmt=connect.prepareStatement(query);
		if(pstmt!=null)
		{
			pstmt.setInt(1, 1);
			pstmt.setString(2, vaccineName);
			pstmt.setString(3, vaccineCompany);
			pstmt.setInt(4, cost);
			
			row=pstmt.executeUpdate();
		}
	} 
	catch (SQLException e) 
	{
		
		e.printStackTrace();
	}
	catch (Exception e) 
	{
		
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			JdbcUtility.closeResource(connect, pstmt);
			
		} catch (SQLException e) 
		{
			
			e.printStackTrace();
		}	
	}
	}
	
}
