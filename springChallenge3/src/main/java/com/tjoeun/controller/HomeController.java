package com.tjoeun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		System.out.println("안녕하세요 !~~ ");
		
		System.out.println(request.getServletContext().getRealPath("/"));
		
	  return "home";
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
}
