package com.myBoard.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@GetMapping("login")
	public String login() {
//		System.out.println("hi");
		return "login";
	}
	
	@GetMapping("login2")
	public String login2() {
//		System.out.println("hi");
		return "login2";
		
	}
	
	@RequestMapping("register")
	public String register() {
//		System.out.println("hi");
		return "register";
		
	}

}
