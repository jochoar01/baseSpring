package com.practicajo.backendjuano.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.practicajo.backendjuano.model.person;

@Controller // Se pone la notacion controller
@RequestMapping("/example2") // para la url
public class ExampleController2 {
	private static final String EXAMPLE2_VIEW = "example2";
	//localhost:8080/example2/request1?nm=JON
	//localhost:8080/example2/request1?nm=MIKEL
	@GetMapping("/request1")
	public ModelAndView  request1(@RequestParam(name="nm", required = false, defaultValue = "NULL") String name ){
		
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		mav.addObject("nm_in_model", name);
		return mav;
			
		
	}
}
