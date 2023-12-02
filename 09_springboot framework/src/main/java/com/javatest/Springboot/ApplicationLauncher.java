package com.javatest.Springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.javatest.Springboot.game.GameRunner;
import com.javatest.Springboot.game.Gameconsole;
import com.javatest.Springboot.game.PacmanGame;


@Configuration
@ComponentScan("com.highradiustest.Springboot.game")
public class ApplicationLauncher {
	
	
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
