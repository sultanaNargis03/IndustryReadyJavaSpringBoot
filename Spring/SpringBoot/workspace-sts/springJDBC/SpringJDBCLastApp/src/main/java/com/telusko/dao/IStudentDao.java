package com.telusko.dao;

import java.util.List;

public interface IStudentDao
{
	public StudentTableBo getStudentById(int id);
	public StudentTableBo getStudentById(int id,String scity);
	public List<StudentTableBo> getAllStudents();
}
