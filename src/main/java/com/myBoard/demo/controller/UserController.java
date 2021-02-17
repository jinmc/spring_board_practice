package com.myBoard.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myBoard.demo.model.User;
import com.myBoard.demo.model.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
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
	
	@GetMapping("register")
	public String showRegister() {
		System.out.println("showing register");
		return "register";
	}
	
//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    public String showRegisterPage() {
//        return "register";
//    }
	
//	@GetMapping("register")
	@PostMapping("register")
//	@RequestMapping(value="register", method= RequestMethod.POST)
	public String register(User user) {
		System.out.println(user);
		user.setRole("admin");
		user.setActive(true);
		
		userRepository.save(user);
		System.out.println("hi");
		return "/login";
		
	}

}
