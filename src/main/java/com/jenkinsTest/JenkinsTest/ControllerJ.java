package com.jenkinsTest.JenkinsTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerJ {
	
	@GetMapping("/data")
	public String get() {
		return "This is Spring boot data hello";
	}

}
