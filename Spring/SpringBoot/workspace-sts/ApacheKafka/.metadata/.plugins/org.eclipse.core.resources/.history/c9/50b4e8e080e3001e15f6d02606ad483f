package com.telusko.config;

import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.telusko.model.Customer;
import com.telusko.util.AppConstants;

@Configuration
public class KafkaPubConfig 
{
	@Bean
	public ProducerFactory<String, Customer> producerFactory() {

		Map<String, Object> configProps = new HashMap<String, Object>();

		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstants.HOST_URL);
		System.out.println("URL is fine");
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		System.out.println("Json data adding in ProducerFactpry is fine");

		return new DefaultKafkaProducerFactory<>(configProps);
	}
	
	@Bean(name = "kafkaTemplate")
	public KafkaTemplate<String, Customer> kafkaTemplate() {
		System.out.println("Customized KafkaTemplate");
		return new KafkaTemplate<>(producerFactory());
	}
	
	
}

