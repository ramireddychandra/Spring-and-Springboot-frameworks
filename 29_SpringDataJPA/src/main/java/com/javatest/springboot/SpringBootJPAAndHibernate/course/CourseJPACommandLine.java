package com.javatest.springboot.SpringBootJPAAndHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javatest.springboot.SpringBootJPAAndHibernate.course.springdataJPA.CourseSpringDataJPARepository;

@Component
public class CourseJPACommandLine implements CommandLineRunner{
	
	@Autowired
	private CourseSpringDataJPARepository Repostory;
	
	@Override
	public void run(String... args) throws Exception {
		Repostory.save(new Course(1,"MYSQL","In28Minutes"));
		Repostory.save(new Course(2,"MYSQ2L","Chandu"));
		Repostory.save(new Course(3,"MYSQL3","In28Minutes"));
//		
		Repostory.deleteById(3);
		
		System.out.println(Repostory.findAll());
		
		System.out.println("new" + Repostory.findById(3));
		
		System.out.println(Repostory.findByAuthor("Chandu"));
		System.out.println(Repostory.findByAuthor("In28Minutes"));

		
		

	}

}
