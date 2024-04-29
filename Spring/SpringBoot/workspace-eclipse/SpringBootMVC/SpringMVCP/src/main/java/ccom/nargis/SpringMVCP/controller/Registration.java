package ccom.nargis.SpringMVCP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Registration 
{
	@PostMapping("/addUser")
	public String addUser()
	{
		
		
		return "register";
	}
}
