package com.javatest.Springboot;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// by default scope is SingleTon
class classA{
	
}

@Component
//@Scope(value="prototype") -- step-1
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class classB{
	
}

@Configuration
@ComponentScan
public class ScopeIntializationLaucherApplication
{
	public static void main(String[] args)
	{
		try(var context = new AnnotationConfigApplicationContext(ScopeIntializationLaucherApplication.class))
		{
			System.out.println(context.getBean(classA.class));
			System.out.println(context.getBean(classA.class));
			System.out.println(context.getBean(classA.class));
			
			System.out.println(context.getBean(classB.class));
			System.out.println(context.getBean(classB.class));
			System.out.println(context.getBean(classB.class));



		}
		
		

	}
}