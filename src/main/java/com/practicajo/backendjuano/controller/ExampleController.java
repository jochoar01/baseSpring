package com.practicajo.backendjuano.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practicajo.backendjuano.model.person;

@Controller // Se pone la notacion controller
@RequestMapping("/example") // para la url
public class ExampleController {
	public static final String EXAMPLE_VIEW = "example";
	// primera forma
	@GetMapping("/exampleString")
	//@RequestMapping(value = "/exampleString", method = RequestMethod.GET)
	public String exampleString(Model model) {
		model.addAttribute("people", getPeople());
		return EXAMPLE_VIEW;
	}



	// Segunda forma
	@GetMapping("/exampleMAV")
	//@RequestMapping(value = "/exampleMAV", method = RequestMethod.GET)
	public ModelAndView exampleMAV() {
    ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
    mav.addObject("people", getPeople());
		return mav;
	}
	
	private List<person> getPeople(){
		List<person> people= new ArrayList<>();
		
		people.add(new person("Juan", 32));
		people.add(new person("Antonia", 6));
		people.add(new person("miguel", 27));
		people.add(new person("Juan", 23));
		return people;
	}
}
