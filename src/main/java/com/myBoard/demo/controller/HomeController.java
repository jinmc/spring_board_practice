package com.myBoard.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	
	@RequestMapping(value={"/", "/home"})
	public String home() {
//		System.out.println("hi");
		return "home";
	}
	
	@RequestMapping("home2")
	public String home2() {
//		System.out.println("hi");
		return "home2";
		
	}
	
}
