package com.javatest.Springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.javatest.Springboot.game.GameRunner;
import com.javatest.Springboot.game.Gameconsole;
import com.javatest.Springboot.game.PacmanGame;
import com.javatest.Springboot.game.SuperContrast;

@Configuration
@ComponentScan
public class Application {
	
	public static void main(String[] args) {
	 try(var context =new AnnotationConfigApplicationContext(Application.class)){
				
		 System.out.println(context.getBean(Gameconsole.class));
		 context.getBean(Gameconsole.class).up();
		 
		 context.getBean(GameRunner.class).run();
		
	 }



	}

}
