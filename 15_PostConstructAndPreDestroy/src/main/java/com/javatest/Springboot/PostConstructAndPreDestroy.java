package com.javatest.Springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


//J2EE >> Java EE >> Jakarta EE

@Component
class SomeDependency{
	public SomeDependency(){
	System.out.println("SomeDependency Bean");
	}
	@PostConstruct
	public void intialize() {
		System.out.println("After Some Dependency class intializtion the fields");
	}
	@PreDestroy
	public void clean() {
		System.out.println("clean After Some Dependency class intializtion the fields");
	}

}

@Component
class SomeClass{
	public SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		System.out.println("SomeClass Bean");
		this.someDependency= someDependency;
	}
	
	
	
	@PostConstruct
	public void intialize() {
		System.out.println("Intializing the fields");
	}
	
	@PreDestroy
	public void Clean() {
		System.out.println("Cleaning the fields");
	}
	
}


@Configuration
@ComponentScan
public class PostConstructAndPreDestroy
{
	public static void main(String[] args)
	{
		try(var context = new AnnotationConfigApplicationContext(PostConstructAndPreDestroy.class))
		{
			System.out.println("This is an Spring IOC container");

		}

	}
}