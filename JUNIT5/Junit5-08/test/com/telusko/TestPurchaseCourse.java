package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.learning.dao.JavaCourse;
import com.learning.service.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void testproceedWithCourse()
	{
		PurchaseCourse pc=new PurchaseCourse();
		boolean status=pc.proceedWithPurchase(new JavaCourse());
		assertTrue(status);
	}

}
