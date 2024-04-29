package com.telusko.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LaunchDemo 
{
	public static void main(String[] args) 
	{
		service();
	}
	private static final Logger logger=LogManager.getLogger(LaunchDemo.class);
	public static void service()
	{
		//bu logic
		//logic to store in db
		
		logger.trace("msg coming from trace method");
		logger.info("msg coming from info method");
		
		logger.debug("msg coming from debug method");
		logger.warn("msg coming from warn method");
		
		logger.error("msg coming from error method");
		
		logger.fatal("msg coming from fatal method");
	}
}
