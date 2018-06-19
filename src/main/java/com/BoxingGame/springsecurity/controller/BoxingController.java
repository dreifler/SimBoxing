package com.BoxingGame.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoxingController {

	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	@GetMapping("/boxers")
	public String showBoxers(){
		
		return "boxers";
	}
	
	@GetMapping("/systems")
	public String showSystems(){
		
		return "systems";
	}
}