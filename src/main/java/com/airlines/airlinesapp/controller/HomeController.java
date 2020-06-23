package com.airlines.airlinesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String test() {
		return "index";
	}
	
	@RequestMapping("/index")
	public String test1() {
		return "index";
	}
	
}
