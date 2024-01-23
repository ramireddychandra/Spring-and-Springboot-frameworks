package com.javatest.Springboot;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
//		1)Launch a Spring Context	
		var context =new AnnotationConfigApplicationContext(AppConfiguration.class);
//		AppConfiguration [Spring COntext]-- Spring Configuration by @Configuration
		
//		2) Configure he things that we want Spring to manage
//		AppConfiguration  - @configuration
//		name - @Bean
		
		System.out.println(context.getBean("CustomerName"));
		System.out.println(context.getBean("age"));
//		System.out.println(context.getBean("ages"));
		System.out.println(context.getBean("person"));
//		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean("person2"));

		System.out.println(context.getBean("person3"));
		System.out.println(context.getBean("person4"));

		System.out.println(context.getBean("address2"));

//		Bean retrival can do 2 ways
//		By calling with bean name
//		By type of the bean
		
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBeanDefinitionCount());
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);



	}

}
