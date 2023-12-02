package com.javatest.Springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javatest.Springboot.game.GameRunner;
import com.javatest.Springboot.game.Gameconsole;

public class Application {

	public static void main(String[] args) {
	 try(var context =new AnnotationConfigApplicationContext(AppConfiguration.class)){
				
		 System.out.println(context.getBean(Gameconsole.class));
		 context.getBean(Gameconsole.class).up();
		 
		 context.getBean(GameRunner.class).run();
		 
		 
//		System.out.println(context.getBean("CustomerName"));
//		System.out.println(context.getBean("age"));
////		System.out.println(context.getBean("ages"));
//		System.out.println(context.getBean("person"));
////		System.out.print(context.getBean(Person.class)); // if we have 2 beans with this call name then compile error
//		System.out.println(context.getBean("person2"));
//		System.out.println(context.getBean("person3"));
//		System.out.println("Bean Names List in the registry");
//		for(String s:context.getBeanDefinitionNames()) {
//			System.out.println(s+ " ");
//		}
//		System.out.println("Bean Names count avaliable in the registry");
//		System.out.println(context.getBeanDefinitionCount());
//		System.out.println("age Bean defination");
//		System.out.println(context.getBeanDefinition("age"));

		
	 }



	}

}
