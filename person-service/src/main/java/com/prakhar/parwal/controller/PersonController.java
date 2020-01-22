package com.prakhar.parwal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PersonController {

	@GetMapping("/")
	public ModelAndView openIndexPage() {
		
		ModelAndView indexPage = new ModelAndView("index");
		return indexPage;
	}
}
