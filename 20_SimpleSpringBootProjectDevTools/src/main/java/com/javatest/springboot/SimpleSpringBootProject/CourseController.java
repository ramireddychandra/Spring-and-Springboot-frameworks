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
				new Courses(2,"SpringBoot","In28miutes"),
				new Courses(3,"Java","In28miutes"),
				new Courses(4,"Jenkins","In28miutes"),
				new Courses(5,"Jenkins","In28miutes"),
				new Courses(6,"Jenkins","In28miutes"),
				new Courses(7,"Jenkins","In28miutes")




				);
	}
	
	

}
