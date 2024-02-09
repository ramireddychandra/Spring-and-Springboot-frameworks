package com.javatest.Springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.javatest.Springboot.db.Datasource;

@Configuration
@ComponentScan
//@ComponentScan("com.highradiustest.Springboot.db")
public class SpringFrameStereotypeAnnotations {
	
	public static void main(String[] args) {		 
		var context = new AnnotationConfigApplicationContext(SpringFrameStereotypeAnnotations.class);
		
		int MaxValue = context.getBean(BussinessCalculatorService.class).findMax();
		System.out.println("Max number of business calcuator : " + MaxValue);
		
		//		for(String s:context.getBeanDefinitionNames()) {
//			System.out.println(s+ " ");
//		}
//		
//		for(int i:context.getBean(Datasource.class).retriveData()) {
//			System.out.println(i+ " ");
//		}
//		
		
	 }
}
