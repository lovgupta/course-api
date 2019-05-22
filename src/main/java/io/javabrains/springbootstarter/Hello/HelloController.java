package io.javabrains.springbootstarter.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/Hello")
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping("/")
	public String homepage() {
		return "This is a Home Page";
	}
}
