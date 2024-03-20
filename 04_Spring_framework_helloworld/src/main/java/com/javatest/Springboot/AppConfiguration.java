package com.javatest.Springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Released in JDK16
record Person(String name,int age,Address address) {};
record Address(String FirstLine, int Pincode) {};

//This is the spring Configuration class

@Configuration
public class AppConfiguration {
	
//	@Bean
//	public String name()
//	{
//		return "chandu";
//	}
//	
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
		return new Person("chandu",23,new Address("Kapada",12345));
	}
	@Bean
//	@Primary // This @ is for class level beans prioitization
	public Person person2()
	{
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person person3(String CustomerName, int age,Address address2)
	{
		return new Person(CustomerName,age,address2);
	}
	@Bean
	public Person person4(String CustomerName, int age, @Qualifier("add3Qualifier")Address address2)
	{
		return new Person(CustomerName,age,address2);
	}
	
	@Bean(name="address2")
	@Primary
	public Address address()
	{
		return new Address("Peddanapadu=,m",516309);
	}
	
	@Bean(name="address3")
	@Qualifier("add3Qualifier")
	public Address address1()
	{
		return new Address("Peddanapad",516309);
	}
}
