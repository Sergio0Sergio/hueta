package com.huetenb.hueta;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	public String greetings (@RequestParam (required = false, defaultValue = "") String name) {
		
		return name.equals("") ? "Hey!" : "Hey, " + name + "!";
	}

}
