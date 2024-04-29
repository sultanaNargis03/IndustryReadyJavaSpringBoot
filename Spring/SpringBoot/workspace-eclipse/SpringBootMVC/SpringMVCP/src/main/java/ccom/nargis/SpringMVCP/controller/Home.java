package ccom.nargis.SpringMVCP.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class Home 
{
	@GetMapping("/welcome")
	public ModelAndView home()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("name","Tamim");
		mav.setViewName("home");
		return mav;
	}
	@GetMapping("/register")
	public String home(Map<String,Object> map)
	{
		map.put("message", "Assalamu alaikum!!");
		return "register";
	}
	@GetMapping("/login")
	public String login(Map<String,Object> map)
	{
		map.put("message", "Assalamu alaikum!!");
		return "login";
	}
}
