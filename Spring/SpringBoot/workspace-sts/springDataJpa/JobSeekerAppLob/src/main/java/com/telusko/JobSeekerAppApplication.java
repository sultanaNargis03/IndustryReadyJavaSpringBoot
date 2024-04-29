package com.telusko;

import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.JobSeeker;
import com.telusko.service.JobSeekerServiceImpl;

@SpringBootApplication
public class JobSeekerAppApplication 
{

	public static void main(String[] args) throws IOException
	{
		ConfigurableApplicationContext context=SpringApplication.run(JobSeekerAppApplication.class, args);
		JobSeekerServiceImpl service = context.getBean(JobSeekerServiceImpl.class);
		
//		InputStream input=null;
//		byte image[]=null;
//		FileReader reader=null;
//		char textFile[]=null;
//		
//		try
//		{
//			input=new FileInputStream("D:\\IndustryReadyJava\\Lob\\java.jpg");
//			image=new byte[input.available()];
//			
//			File file=new File("D:\\IndustryReadyJava\\Lob\\java.txt");
//			reader = new FileReader(file);
//			textFile=new char[(int)file.length()];
//			reader.read(textFile);
//						
//		} 
//		catch (FileNotFoundException e)
//		{
//			
//			e.printStackTrace();
//		} catch (IOException e) 
//		{
//			
//			e.printStackTrace();
//		}
//		
//		JobSeeker job=new JobSeeker("Alien","Bengaluru",image,textFile);
//		String status=service.registerJobSeeker(job);
//		System.out.println(status);
//		try 
//		{
//			input.close();
//			reader.close();
//		} 
//		catch (IOException e)
//		{
//			
//			e.printStackTrace();
//		}
		Integer id=1;
		Optional<JobSeeker> optional = service.getDetailsById(id);
		if(optional.isPresent())
		{
			JobSeeker job=optional.get();
			System.out.println(job.getId()+" : "+job.getName()+" : "+job.getCity());
		
			FileOutputStream output = new FileOutputStream("java.jpeg");
			output.write(job.getImage());
			output.flush();
			
			FileWriter writer = new FileWriter("java.txt");
			writer.write(job.getTextFile());
			writer.flush();
			
		}
		else
		{
			System.out.println("There is no record with the given id "+id);
		}
		
		context.close();
	}

}
