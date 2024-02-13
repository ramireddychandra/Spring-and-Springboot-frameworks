package com.javatest.springboot.SpringBootJPAAndHibernate;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javatest.springboot.SpringBootJPAAndHibernate.course.jdbc.CourseJDBCRepository;

@RestController
public class CourseController {
	
	@Autowired
	private CourseJDBCRepository CourseJDBCRepository;
	
//	Course course1 = CourseJDBCRepository.fetch(2);

	
	@RequestMapping("/Courselistonfilter")
	public Course filteredCourse()
	{
		Course course1 = CourseJDBCRepository.fetch(2);

		return course1;	}
	
	@RequestMapping("/Courselistonfilterstirng")
	public String filteredCourses()
	{
		Course course1 =CourseJDBCRepository.fetch(3);
		return "Your course id is : "+course1.getId()+" and selected course is "+course1.getName()+" By author '"+ course1.getAuthor()+" '";
	}

}
