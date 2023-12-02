package com.javatest.Springboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.javatest.Springboot.game.GameRunner;
import com.javatest.Springboot.game.Gameconsole;
import com.javatest.Springboot.game.PacmanGame;

// field injection

@Component
class YourBusinessClass{
//	@Autowired
//	dependency1 dep1;
//	@Autowired
//	dependency2 dep2;
//	public String toString()
//	{
//		return "Bean is"+dep1+" "+dep2;
//	}
	

	dependency1 dep1;
	dependency2 dep2;


//	public dependency1 getDep1() {
//		return dep1;
//	}
//	@Autowired
//	public void setDep1(dependency1 dep1) {
//		this.dep1 = dep1;
//	}
//
//	public dependency2 getDep2() {
//		return dep2;
//	}
//	@Autowired
//	public void setDep2(dependency2 dep2) {
//		this.dep2 = dep2;
//	}

	
@Autowired
public YourBusinessClass(dependency1 dep1, dependency2 dep2) {
		super();
		this.dep1 = dep1;
		this.dep2 = dep2;
	}

	
	public String toString()
	{
		return "Bean is"+dep1+" "+dep2;
	}

}

@Component
class dependency1{
	
}
@Component
class dependency2{
	
}

@Configuration
@ComponentScan //("com.highradiustest.Springboot.game")
public class ApplicationLauncher {
	
	public static void main(String[] args) {
	 try(var context =new AnnotationConfigApplicationContext(ApplicationLauncher.class)){
		 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		 System.out.println(context.getBean(YourBusinessClass.class));

//		 System.out.println(context.getBean(Gameconsole.class));
//		 System.out.println(context.getBean("mario"));
////		 System.out.println(context.getBean("pacman"));
//		 context.getBean(Gameconsole.class).up();
//		 
//		 context.getBean(GameRunner.class).run();
//		
	 }



	}

}
