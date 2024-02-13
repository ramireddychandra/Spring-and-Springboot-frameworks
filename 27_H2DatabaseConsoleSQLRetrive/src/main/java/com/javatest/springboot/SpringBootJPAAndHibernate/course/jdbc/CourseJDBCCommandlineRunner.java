package com.javatest.springboot.SpringBootJPAAndHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javatest.springboot.SpringBootJPAAndHibernate.Course;

@Component
public class CourseJDBCCommandlineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJDBCRepository CourseJDBCRepository;
	

	@Override
	public void run(String... args) throws Exception {
		CourseJDBCRepository.insert(new Course(1,"sql","in28minutes"));
		CourseJDBCRepository.insert(new Course(2,"AWS","in28minutes"));
		CourseJDBCRepository.insert(new Course(3,"SpringBoot","Youtube"));
//		CourseJDBCRepository.delete(3);
		
		
		System.out.println(CourseJDBCRepository.fetch(2));
		System.out.println(CourseJDBCRepository.fetch(3));



	}
	
	
	

}
