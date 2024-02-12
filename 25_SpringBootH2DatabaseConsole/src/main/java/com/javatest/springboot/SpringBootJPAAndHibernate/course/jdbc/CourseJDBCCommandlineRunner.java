package com.javatest.springboot.SpringBootJPAAndHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandlineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJDBCRepository CourseJDBCRepository;

	@Override
	public void run(String... args) throws Exception {
		CourseJDBCRepository.insert();
	}
	
	
	

}
