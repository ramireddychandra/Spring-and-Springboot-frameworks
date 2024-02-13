package com.javatest.springboot.SpringBootJPAAndHibernate;

import org.springframework.boot.context.properties.ConfigurationProperties;

public class Course {
	
	private int id;
	private String name;
	private String author;
	
	public Course() {
		super();
	}


	public Course(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	
	
	
	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
