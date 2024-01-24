package com.javatest.Springboot.Hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javatest.Springboot.game.GameRunner;
import com.javatest.Springboot.game.Gameconsole;
import com.javatest.Springboot.game.PacmanGame;

record Person(String name,int age) {}

@Configuration
public class AppHelloConfiguration {
	
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
