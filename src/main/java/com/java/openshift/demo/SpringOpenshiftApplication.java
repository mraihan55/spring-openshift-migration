package com.java.openshift.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftApplication {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome ...";		
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Welcome ..." +input+ " appliction is successfully deployed ...";		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftApplication.class, args);
	}

}
