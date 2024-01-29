package com.javatest.Springboot;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.javatest.Springboot.SearchingAlgo.AnotherComplexAlgo;
import com.javatest.Springboot.SearchingAlgo.BubbleSort;
import com.javatest.Springboot.SearchingAlgo.ComplexAlogorithm;
import com.javatest.Springboot.SearchingAlgo.SortingAlgorithm;

@Configuration
@ComponentScan("com.javatest.Springboot.SearchingAlgo")
public class ScopeIntializationLaucherApplication
{
	public static void main(String[] args)
	{
		try(var context = new AnnotationConfigApplicationContext(ScopeIntializationLaucherApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//			SortingAlgorithm BubbleSorts = new BubbleSort();
//			SortingAlgorithm ComplexAlogorithms = new ComplexAlogorithm();
//			AnotherComplexAlgo AnotherComplexAlgos = new AnotherComplexAlgo(ComplexAlogorithms);
			System.out.println("Before Bean call");
			System.out.println(context.getBean(AnotherComplexAlgo.class));
			System.out.println("After Bean call");

		}
		
		

	}
}