package com.myBoard.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myBoard.demo.model.MyUserDetails;
import com.myBoard.demo.model.Post;
import com.myBoard.demo.model.PostRepository;
import com.myBoard.demo.model.UserRepository;

@Controller
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	
	@RequestMapping("editform")
	String editForm() {
		return "editform";
	}
	
	
	
	@PostMapping("savePost")
	String savePost(Post post) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal(); 
		MyUserDetails userDetails = (MyUserDetails) principal; 
		String username = userDetails.getUsername();
		
		System.out.println(username);
		post.setCount(0);
		post.setUserName(username);
		postRepository.save(post);
		
//		출처: https://itstory.tk/entry/Spring-Security-현재-로그인한-사용자-정보-가져오기 [덕's IT Story]
//		CustomUser customUser = (CustomUser)authentication.getPrincipal();
//		int userId = customUser.getUserId();
		return "redirect:/home";
	}

}
