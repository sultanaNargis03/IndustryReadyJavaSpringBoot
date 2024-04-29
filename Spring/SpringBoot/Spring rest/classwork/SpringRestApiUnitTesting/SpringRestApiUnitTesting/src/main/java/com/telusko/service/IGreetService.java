package com.telusko.service;

import com.telusko.controller.Tourist;

public interface IGreetService 
{
	public String generateWishes();
	public Boolean registerTourist(Tourist tourist);
}
