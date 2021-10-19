package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/")
	public String showHome()
	{
		return "home";  // "WEB_INF/view/home.jsp" - based on prefix and suffix added on DemoAppConfig.java 
	}
}
