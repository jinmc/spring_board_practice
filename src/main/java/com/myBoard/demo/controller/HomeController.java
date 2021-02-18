package com.myBoard.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myBoard.demo.model.Post;
import com.myBoard.demo.model.PostRepository;

@Controller
public class HomeController {

	@Autowired
	private PostRepository postRepository;

	@RequestMapping(value={"/", "/home"})
	public String home(Model model) {
		List<Post> postList = postRepository.findAll();
		System.out.println(postList);
		model.addAttribute("posts", postList);
//		System.out.println("hi");
		return "home";
	}
	
	@RequestMapping("home2")
	public String home2() {
//		System.out.println("hi");
		return "home2";
		
	}
	
}
