package com.learning.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	
	@GetMapping("/greet")
	public String greeting()
	{
		return "Hello!!";
	}
	@GetMapping("/info")
	public String aboutMachine()
	{
		String os=System.getProperty("os.name");
		String version=System.getProperty("os.version");
		String architecture=System.getProperty("os.arch");
		String javaVersion=System.getProperty("java.version");
		String user=System.getProperty("user.name");
		
		return "OS: "+os+", Version: "+version+", Architecture: "+architecture+", Java Version: "+javaVersion+", User: "+user;
	}

}
