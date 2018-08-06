package com.training.exilant.restfulworks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	// @RequestMapping(method=RequestMethod.GET,path="hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorl() {
		return "HelloWorld";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorld hellowor() {
		return new HelloWorld("hello wrold");
	}

	// http://localhost:8080/hello-world/harry
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorld helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorld("Hello mr/ms/mrs :" + name);
	}
}
