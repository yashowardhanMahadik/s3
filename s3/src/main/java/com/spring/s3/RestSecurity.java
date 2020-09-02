package com.spring.s3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/haha")
public class RestSecurity {
	
	@GetMapping(name = "/")
	public String hello() {
		// TODO Auto-generated method stub
		return "Spring Security home";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1> for the USER</h1>";
				
	}
	
	
	@GetMapping("/admin")
	public String admin() {
		return "<h2> for the admin</h2>";
		
	}
}
