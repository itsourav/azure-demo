package com.example.sourav.azuredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/test")
	public String test() {
		
		
		return "Welcome again to Azure CI/CD";
	}

}
