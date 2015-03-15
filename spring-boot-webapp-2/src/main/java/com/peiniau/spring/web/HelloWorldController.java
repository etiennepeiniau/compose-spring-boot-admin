package com.peiniau.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.peiniau.spring.service.HelloWorldService;

@Controller
public class HelloWorldController {

	@Autowired
	private HelloWorldService helloWorldService;

	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {
		return this.helloWorldService.getHelloMessage();
	}

}
