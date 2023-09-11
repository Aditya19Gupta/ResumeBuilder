package com.resumebuilder.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.resumebuilder.entities.User;



@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public String getHomePage() {
		
		return "generate_cv";
	}
	
	@GetMapping("/resume-fields")
	public String getResumePage(Model m) {
		
		m.addAttribute("resume",new User());
		
		return "resume";
	}
	

}
