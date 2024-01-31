package com.javatest.Springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;

// Injected POM.XML Dependency ---

//@Component
@Named
class BusinessService{
	DataService dataservice;

	public DataService getDataservice() {
		System.out.println("Setter");
		return dataservice;
	}
	
//	@Autowired
	@Inject
	public void setDataservice(DataService dataservice) {
		this.dataservice = dataservice;
	}
	
	
}

//@Component
@Named
class DataService{
	
}


@Configuration
@ComponentScan
public class JakartaContextsAndDependencyInjection
{
	public static void main(String[] args)
	{
		try(var context = new AnnotationConfigApplicationContext(JakartaContextsAndDependencyInjection.class))
		{
			System.out.println(context.getBean(BusinessService.class).getDataservice());
		}

	}
}