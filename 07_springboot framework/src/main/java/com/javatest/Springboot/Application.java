package com.javatest.Springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javatest.Springboot.game.GameRunner;
import com.javatest.Springboot.game.Gameconsole;
import com.javatest.Springboot.game.PacmanGame;


@Configuration
class AppConfiguration {
	
	@Bean
	public Gameconsole game()
	{
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(Gameconsole game)
	{
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}

public class Application {

	public static void main(String[] args) {
	 try(var context =new AnnotationConfigApplicationContext(AppConfiguration.class)){
				
		 System.out.println(context.getBean(Gameconsole.class));
		 context.getBean(Gameconsole.class).up();
		 
		 context.getBean(GameRunner.class).run();
		
	 }



	}

}
