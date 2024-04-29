package com.telusko.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.model.CustomerInfo;
import com.telusko.service.ICustomerService;

@Controller
public class CustomerController 
{
	@Autowired
	private ICustomerService service;
    
	@GetMapping("/cxlist")
	public String fetchCustomersData(Model model)
	{
		List<CustomerInfo> customerlist = service.getCustomers();
		customerlist.forEach(c->System.out.println(c));
		model.addAttribute("customers", customerlist);
		return "customerlist";
	}
	@GetMapping("/showForm")
	public String showFormPage(Map<String, Object> model)
	{
		CustomerInfo customer=new CustomerInfo();
		model.put("customer", customer);
		return "showform";
	}
	
	
	@PostMapping("/registerCustomer")
	public String registerCx(@ModelAttribute("customer")CustomerInfo customer,Map<String, Object> model)
	{
		service.registerCustomer(customer);
		return "redirect:/cxlist";
	}
	
	@GetMapping("/updateForm")
	public String updateCx(@RequestParam("customerId")Integer id,Map<String, Object> model)
	{
		CustomerInfo customer = service.getCx(id);
		model.put("customer", customer);
		return "updateform";
	}
	
	@GetMapping("/deleteData")
	public String deleteCx(@RequestParam("customerId")Integer id,Map<String, Object> model)
	{
		service.deleteCx(id);
		return "redirect:/cxlist";
	}
	
	
	
}
