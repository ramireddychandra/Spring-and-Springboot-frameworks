package com.javatest.springboot.SpringBootJPAAndHibernate.course.springdataJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatest.springboot.SpringBootJPAAndHibernate.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Integer>{
	
	List<Course> findByAuthor(String author);
}
