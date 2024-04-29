package com.telusko.beans;

public class Alpha {

	private Beta beta;
	public Alpha() 
	{
		System.out.println("Alpha bean created");

	}
	
//	public Alpha(Beta beta) {
//		super();
//		this.beta = beta;
//	}

	public void setBeta(Beta beta) {
		this.beta = beta;
		System.out.println("setBeta() invocked and injected in  Alpha class");
	}

}
