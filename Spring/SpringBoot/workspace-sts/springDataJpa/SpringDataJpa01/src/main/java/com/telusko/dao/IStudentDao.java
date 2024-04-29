package com.telusko.dao;
import java.io.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //not mandotory
public interface IStudentDao extends CrudRepository<StudentTable,Serializable>{

}
