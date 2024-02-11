package com.javatest.springboot.SimpleSpringBootProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Courses> retriveAllCourses(){
		return Arrays.asList(
				new Courses(1,"AWS","In28miutes"),
				new Courses(2,"SpringBoot","In28miutes")
				);
	}
	
	

}
