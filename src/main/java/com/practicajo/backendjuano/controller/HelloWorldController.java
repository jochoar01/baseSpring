package com.practicajo.backendjuano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Se pone la notacion controller
@RequestMapping("/say") //para la url
public class HelloWorldController {
	@GetMapping("/helloworld")
	public String helloWorld(){
		
		return "gestionusuarios";
		
	}

}
