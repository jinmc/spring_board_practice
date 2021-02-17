package com.myBoard.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
	
	@RequestMapping("editform")
	String editForm() {
		return "editform";
	}

}
