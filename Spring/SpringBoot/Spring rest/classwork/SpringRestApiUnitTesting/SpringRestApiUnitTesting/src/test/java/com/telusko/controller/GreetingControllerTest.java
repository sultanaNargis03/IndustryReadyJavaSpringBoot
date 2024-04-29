package com.telusko.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.service.IGreetService;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTest 
{
	
	@MockBean
	private IGreetService service;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	@Disabled
	public void testGreetingUnit() throws Exception
	{
		//Mocking
		Mockito.when(service.generateWishes()).thenReturn("Good Morning");
		
		//RequestObject
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/api1");
		
		ResultActions perform = mockMvc.perform(reqBuilder);
		
		MvcResult mvcResult = perform.andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int status=response.getStatus();
		
		
		assertEquals(200, status);
		
	}
	
	@Test
	public void testTouristRegister() throws Exception
	{
		//Mocking
		Mockito.when(service.registerTourist(ArgumentMatchers.any())).thenReturn(true);
		
		Tourist tourist=new Tourist(101, "Bengaluru", "Rohan", "Diamond", 45455.5);
		ObjectMapper mapper = new ObjectMapper();
		String json=mapper.writeValueAsString(tourist);
		
		//RequestObject
		MockHttpServletRequestBuilder reqBuilder = 
				MockMvcRequestBuilders.post("/register").
				contentType(MediaType.APPLICATION_JSON).
				content(json);
		
		ResultActions perform = mockMvc.perform(reqBuilder);
		
		MvcResult mvcResult = perform.andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int status=response.getStatus();
		System.out.println(status);
		assertEquals(300, status);
		
		
		
		
		
	}
	
	

}
