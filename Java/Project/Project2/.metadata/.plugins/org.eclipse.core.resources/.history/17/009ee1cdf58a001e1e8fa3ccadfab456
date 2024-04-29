package com.telusko.app.servive;


import java.util.List;
import java.util.Random;

import com.telusko.app.model.User;
import com.telusko.app.servive.impl.TransactionInterface;

public class TransactionService implements TransactionInterface
{
	private static final int MIN_AMOUNT = 1000;
    private static final int MAX_AMOUNT = 20000;
   
    private List<User>users;
    int tAmt;
    
    public TransactionService(List<User> users)
    {
    	this.users=users;
 
    }
    

	@Override
	public void generateRandomTransaction() 
	{
		Random random = new Random();
		int randomAmount= random.nextInt(MAX_AMOUNT - MIN_AMOUNT + 1) + MIN_AMOUNT; 
        int randomUserId = random.nextInt(users.size()); 
        int id=randomUserId+1;
        //System.out.println("User "+id+" : "+randomAmount);
        
        User user = users.get(randomUserId);
        calculateCreditPoints(user, randomAmount);
        
        //calculateCreditPoints(id,randomAmount);
	}

	@Override
	public void calculateCreditPoints(User user,int amount) 
	{
		
		 earnPoints(user, amount);
	     System.out.println(user.getName() + " spent " + amount + " rs. Earned " + (amount / 100) + " points.");
		
	}
	public void earnPoints(User user, int amount) 
	{
		user.setAmount(user.getAmount()+amount);
        user.setPoints(user.getPoints() + amount / 100);
     //   System.out.println("total credit points:"+user.getPoints());
	}   
	
}
