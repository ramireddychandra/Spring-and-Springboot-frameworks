package com.javatest.Springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.javatest.Springboot.game.GameRunner;
import com.javatest.Springboot.game.Gameconsole;
import com.javatest.Springboot.game.PacmanGame;


@Configuration
@ComponentScan("com.javatest.Springboot.game")
public class ApplicationLauncher {
	
//	Game Bean is created by bean for that added @compoenet at class level and added Componentscan at IOC level...
	
//	@Bean
//	public GameRunner gameRunner(Gameconsole game)
//	{
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}

	public static void main(String[] args) {
	 try(var context =new AnnotationConfigApplicationContext(ApplicationLauncher.class)){
				
		 System.out.println(context.getBean(Gameconsole.class));
		 System.out.println(context.getBean("mario"));
//		 System.out.println(context.getBean("pacman"));
		 context.getBean(Gameconsole.class).up();
		 
		 context.getBean(GameRunner.class).run();
		
	 }



	}

}
