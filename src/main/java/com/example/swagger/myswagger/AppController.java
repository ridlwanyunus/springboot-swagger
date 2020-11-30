package com.example.swagger.myswagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping(value="/")
	public String index() {
		return "redirect:swagger-ui.html";
	}
	
}
