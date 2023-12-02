package com.javatest.Springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
	
		var context =new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		System.out.println(context.getBean("CustomerName"));
		System.out.println(context.getBean("age"));
//		System.out.println(context.getBean("ages"));
		System.out.println(context.getBean("person"));
		System.out.print(context.getBean(Person.class));
		System.out.println(context.getBean("person2"));

		System.out.println(context.getBean("person3"));



	}

}
