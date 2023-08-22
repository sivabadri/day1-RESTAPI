package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome to spring Boot!";
	}
	@Value("Blue")
	public String colour;
	@GetMapping("/Fav")
     public String display()
     {
    	 return "My favourite colour is "+colour;
     }
	
	@Value("siva")
	public String name;
	@GetMapping("/display")
	public String display1()
	{
		return "Welcome "+name;
	}

}
