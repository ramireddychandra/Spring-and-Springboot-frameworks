package com.javatest.Springboot;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class classA
{
	public classA()
	{
		System.out.println("Constructor of classA");
	}
	
}

@Component
@Lazy
class classB
{
	private classA classA;
	public classB(classA classA)
	{
		this.classA = classA;
		System.out.println("Constructor of classB");
	}
	
	public void method(String Input) {
		System.out.println(Input);
	}
}

@Configuration
@ComponentScan
public class LazyIntializationLauncherApplication
{
	public static void main(String[] args)
	{
		try(var context = new AnnotationConfigApplicationContext(LazyIntializationLauncherApplication.class))
		{
			System.out.println("Intialization of Main Class");
			context.getBean(classB.class).method("");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}
		
		

	}
}