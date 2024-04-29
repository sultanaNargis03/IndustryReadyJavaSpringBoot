package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.IPurchaseOrder;
import com.telusko.service.PurchaseOrderImpl;

@SpringBootApplication
public class MailIntegrationSpringBootApplication 
{

	public static void main(String[] args) throws Exception 
	{
		ConfigurableApplicationContext context = SpringApplication.run(MailIntegrationSpringBootApplication.class, args);
		
		PurchaseOrderImpl service = context.getBean(PurchaseOrderImpl.class);
		String status=service.purchase(new String[] {"Java","Spring","DP","Microdervices"},
				new Double[] {4445.4,6666.4,555.5,543.4},
				new String[] {"tamimsheikh2303@gmail.com"}
				);
		System.out.println(status);
	}

}
