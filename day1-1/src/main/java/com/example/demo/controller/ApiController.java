package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
@GetMapping("show")
public String display() {
	return "Welcome";
}
@Value("${col}")
private String colour;
@Value("${Name}")
private String name;
@GetMapping("/Fav")
public String disp()
{
	
	return "My favorite colour is "+colour;
}
@GetMapping("/display")
public String print() 
{
	return "Welcome " +name;
}
}
