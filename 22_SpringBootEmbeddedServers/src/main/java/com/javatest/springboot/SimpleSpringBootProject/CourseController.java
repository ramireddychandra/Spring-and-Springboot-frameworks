package com.javatest.springboot.SimpleSpringBootProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currencyConfiguration")
	public CurrencyServiceConfiguration retriveAllCourses(){
		return configuration;
	}
	
	

}
