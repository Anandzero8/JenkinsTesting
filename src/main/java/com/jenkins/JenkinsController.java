package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/jenkin")
public class JenkinsController {
	@GetMapping("/get")
	public String getString() {
		return "hello world";
	}
}
