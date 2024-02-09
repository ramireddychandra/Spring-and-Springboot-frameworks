package com.javatest.Springboot;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatest.Springboot.gane.GameRunner;

public class XMLConfigurationcontextLauncherApplication
{
	public static void main(String[] args)
	{
		try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml") )
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			context.getBean(GameRunner.class).run();
		}

	}
}