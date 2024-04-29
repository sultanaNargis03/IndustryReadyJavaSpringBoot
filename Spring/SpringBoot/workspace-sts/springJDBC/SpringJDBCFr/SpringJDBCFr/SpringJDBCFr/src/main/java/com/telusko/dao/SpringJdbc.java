package com.telusko.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbc 
{
//	  private static final String SQL_QUERY = "INSERT INTO STUDENT(id, name, city)"
//	  		+ "values(1, 'Nargis',' Kolkata')";
	
	  private static final String SQL_QUERY = "insert into course(cid, cname) Values(?,?)";
	  private static final String SELECT_QUERY = "SELECT cid, cname from course where cid=?";
//	  private static final String SELECT_QUERY = "SELECT * from course";
	  private static final String DELETE_QUERY = "DELETE from course where cid=?";
	  
	 @Autowired
      private JdbcTemplate jdbc;
	  
//	  public void insert()
//	  {
//		  System.out.println("Implementing class of JDBCTemplate : "+ jdbc.getClass().getName());
//		  jdbc.update(SQL_QUERY);
//	  }
	 
	  public void insert(CourseInfo info)
	  {
		  System.out.println("Implementing class of JDBCTemplate : "+ jdbc.getClass().getName());
		  System.out.println(info.getCname() + " "+info.getCid());
		  int rowsAffected=jdbc.update(SQL_QUERY,info.getCid(), info.getCname());
		  System.out.println("Rows affected : "+ rowsAffected);
	
	  }
	  
	  public void deleteById(long id)
	  {
		 int row= jdbc.update(DELETE_QUERY,id);
		 System.out.println(row +" record deleted with id "+id); 
	  }
//	  public CourseInfo findById(long id)
//	  {
//		return jdbc.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(CourseInfo.class),id);  
//	  }
	  public List<CourseInfo> findById(long id)
	  {
		  List<CourseInfo> list=jdbc.query(SELECT_QUERY, (rs,n)->
		  {
			  CourseInfo info=new CourseInfo();
			  info.setCid(rs.getInt(1));
			  info.setCname(rs.getString(2));
			  return info;
		  });
				 
		return list;
	  }
}