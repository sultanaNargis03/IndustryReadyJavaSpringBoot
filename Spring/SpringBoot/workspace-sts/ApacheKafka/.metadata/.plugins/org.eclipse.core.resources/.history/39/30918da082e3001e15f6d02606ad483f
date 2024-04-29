package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.telusko.model.Customer;
import com.telusko.util.AppConstants;

@Service
public class KafkaService 
{
	
	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;
	
	public String addMsg(Customer cx) {

		System.out.println(cx + " is in service");
		kafkaTemplate.send(AppConstants.TOPIC_NAME, cx);
         System.out.println("Able to send data");
		return "Msg Published To Kafka Topic";
	}
	
	public String add(List<Customer> customers) {

		if (!customers.isEmpty()) {
			for (Customer c : customers) {
				kafkaTemplate.send(AppConstants.TOPIC_NAME, c);
				System.out.println("************Msg published to Kafka topic***************");
			}
		}
		return "Customer Records Added To Kafka  Successfully";
	}

	
}
