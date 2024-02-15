package com.javatest.springboot.SpringBootJPAAndHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javatest.springboot.SpringBootJPAAndHibernate.course.jpa.CourseJPARepostory;

@Component
public class CourseJPACommandLine implements CommandLineRunner{
	
	@Autowired
	private CourseJPARepostory Repostory;
	
	@Override
	public void run(String... args) throws Exception {
		Repostory.insert(new Course(1,"MYSQL","In28Minutes"));
		Repostory.insert(new Course(2,"MYSQ2L","In28Minutes"));
		Repostory.insert(new Course(3,"MYSQL3","In28Minutes"));
//		
		Repostory.deleteId(2);
		System.out.println("new" + Repostory.findById(3));

	}

}
