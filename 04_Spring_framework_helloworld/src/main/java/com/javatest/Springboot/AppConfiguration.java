package com.javatest.Springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age) {}

@Configuration
public class AppConfiguration {
	@Bean(name ="CustomerName")
	public String name()
	{
		return "chandu";
	}
	@Bean
	public int age()
	{
		return 24;
	}
	@Bean
	public Person person()
	{
		return new Person("chandu",23);
	}
	@Bean
	@Primary // This @ is for class level beans prioitization
	public Person person2()
	{
		return new Person(name(),age());
	}
	
	@Bean
	public Person person3(String CustomerName, int age)
	{
		return new Person(CustomerName,age);
	}
	
}
