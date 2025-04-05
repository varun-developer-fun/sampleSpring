package com.project.batch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.batch.service.UserService;

@Controller
public class UserController {

	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public String dashBoard()
	{
		return "dashboard";
	}
}
