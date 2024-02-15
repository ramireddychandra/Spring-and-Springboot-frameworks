package com.javatest.springboot.SpringBootJPAAndHibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javatest.springboot.SpringBootJPAAndHibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepostory {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course)
	{
		entityManager.merge(course);
	}
	
	public Course findById(long Id)
	{
		return entityManager.find(Course.class,Id);
	}
	
	public void deleteId(long Id)
	{
		Course c1 =  entityManager.find(Course.class,Id);
		entityManager.remove(c1);
	}

}
