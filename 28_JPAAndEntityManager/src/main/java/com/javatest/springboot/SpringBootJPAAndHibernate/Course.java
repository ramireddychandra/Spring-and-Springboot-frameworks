package com.javatest.springboot.SpringBootJPAAndHibernate;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
// if the entity is different (name="course")
public class Course {
	
	@Id
	private int id;
//	@Column(name="name") -//Name is same so we dont need this
	private String name;
//	@Column(name="author") -//Name is same so we dont need this
	private String author;
	
	public Course() {
		super();
	}


	public Course(int id, String name, String author) {
		super();
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
