package com.telusko.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements IStudentDao 
{
	private static final String SELECT_QUERY = "select * from students where sid=?";

	private static final String SELECT_QUERY2 = "select * from students where sid=? and scity=?";

	private static final String SELECT_QUERY3 = "select * from students";
	
	@Autowired
	private JdbcTemplate jdbc;
	
//	private static class RowMapperImp implements RowMapper<StudentTableBo>
//	{
//
//		@Override
//		public StudentTableBo mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//			return null;
//		}
//		
//	}
	
//	@Override
//	public StudentTableBo getStudentById(int id) 
//	{
//		jdbc.queryForObject(SELECT_QUERY, new RowMapper<StudentTableBo>()
//		{
//
//			@Override
//			public StudentTableBo mapRow(ResultSet rs, int rowNum) throws SQLException 
//			{
//				StudentTableBo bo=new StudentTableBo();
//				bo.setSid(rs.getInt(1));
//				bo.setSname(rs.getString(3));
//				bo.setSage(rs.getInt(2));
//				bo.setScity(rs.getString(4));
//				
//				return bo;
//			}
//			
//		}
//		,id);
//		return null;
//	}
	
	@Override
	public StudentTableBo getStudentById(int id) 
	{
		return jdbc.queryForObject(SELECT_QUERY,(rs,rowNum)->
		{
			StudentTableBo bo=new StudentTableBo();
			bo.setSid(rs.getInt("sid"));
			bo.setSname(rs.getString("sname"));
			bo.setSage(rs.getInt("sage"));
			bo.setScity(rs.getString("scity"));
			
			return bo;
		}
		,id);
		
	}

	@Override
	public StudentTableBo getStudentById(int id, String scity) {
		return jdbc.queryForObject(SELECT_QUERY2,(rs,rowNum)->
		{
			StudentTableBo bo=new StudentTableBo();
			bo.setSid(rs.getInt(1));
			bo.setSname(rs.getString(3));
			bo.setSage(rs.getInt(2));
			bo.setScity(rs.getString(4));
			
			return bo;
		}
		,id,scity);
	}

	@Override
	public List<StudentTableBo> getAllStudents() {
		
		return jdbc.query(SELECT_QUERY3, (rs,rowNum)->
		{
			StudentTableBo bo=new StudentTableBo();
			bo.setSid(rs.getInt(1));
			bo.setSname(rs.getString(3));
			bo.setSage(rs.getInt(2));
			bo.setScity(rs.getString(4));
			return bo;
		}
		);
	}

}
