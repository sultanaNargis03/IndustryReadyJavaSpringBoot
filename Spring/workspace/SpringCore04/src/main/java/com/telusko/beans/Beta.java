package com.telusko.beans;

public class Beta {

	private Alpha alpha;
	public Beta() {
		System.out.println("Beta bean created");
	}
	
	public Beta(Alpha alpha) {
		super();
		this.alpha = alpha;
		System.out.println("constructor injection");
	}

//	public void setAlpha(Alpha alpha) {
//		this.alpha = alpha;
//		System.out.println("setAlpha() invocked and injected in  Beta class");
//	}
	
}
