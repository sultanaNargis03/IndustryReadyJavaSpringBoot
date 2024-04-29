package com.telusko.app.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.telusko.app.model.User;
import com.telusko.app.servive.TransactionService;
import com.telusko.app.servive.UserService;
import com.telusko.app.servive.impl.UserServiceInterface;
public class LaunchRewardApp 
{

	public static void main(String[] args) 
	{
		List<User> users=new ArrayList<>();
		users.add( new User(1, "User1", "pwd1"));
		users.add( new User(2, "User2", "pwd2"));
		users.add( new User(3, "User3", "pwd3"));
		users.add( new User(4, "User4", "pwd4"));
		users.add( new User(5, "User5", "pwd5"));
		
		List<String>elec=new ArrayList<>();
		elec.add("Watch");
		elec.add("HeadPhone");
		elec.add("Earbuds");
		elec.add("phone");
		elec.add("Laptop");
		List<String>travel=new ArrayList<>();
		travel.add("Vacation Package");
		travel.add("Travel Voucher");
		travel.add("Adventure Tour");
		List<String>course=new ArrayList<>();
		course.add("Java");
		course.add("Data Structure");
		course.add("React");
		course.add("Hibernate");
		Map<String, List<String>> rewards = new HashMap<>();
        rewards.put("Electronics",elec);
        rewards.put("Travel",travel);
        rewards.put("Course",course);
        
		TransactionService service=new TransactionService(users);
		Thread t1=new Thread()
				{
					public void run()
					{
						while(true)
						{
							
							service.generateRandomTransaction();
							try {
								Thread.sleep(10000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				};
		t1.start();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your password");
		String pwd=sc.nextLine();
		
		UserServiceInterface us=new UserService(users,rewards);
		User currentUser=us.login(id,pwd);
		
		if(currentUser!=null)
		{
			System.out.println("Login successfull!!");
			System.out.println("User details: "+currentUser);
			
			System.out.println("Do you want to see your tootal credit points?(Y/N)");
			String input1=sc.nextLine();
			if(input1.equalsIgnoreCase("y"))
			{
				us.showCreditPoints(currentUser);
			}	
			else if(input1.equalsIgnoreCase("N"))
			{
				
			}
			else
			{
				System.out.println("wrong input");
			}
			System.out.println("Do you want to redeem the rewards?(Y/N)");
			String input2=sc.nextLine();
			if(input2.equalsIgnoreCase("y"))
			{
				System.out.println("Please choose the reward category:\t1.Electronics\t2.Travel\t3.Course");
				int cc=sc.nextInt();
				sc.nextLine();
	
				switch(cc)
				{
					case 1->
					{
						System.out.println(rewards.get("Electronics"));
					}
					case 2->
					{
						System.out.println(rewards.get("Travel"));
					}
					case 3->
					{
						System.out.println(rewards.get("Course"));
					}
					default->
					{
						System.out.println("Invalid choice!!");
					}
				}
				System.out.println("Please choose your reward");
				String cr=sc.nextLine();
				us.redemRewards(currentUser,cr);
			}	
			else if(input1.equalsIgnoreCase("N"))
			{
				
			}
			else
			{
				System.out.println("wrong input");
			}
			
		}

		else
		{
			System.out.println("Invalid credentials");
		}
		
		
	}

}
