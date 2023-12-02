package com.javatest.Springboot.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private Gameconsole game;
	
	
	public GameRunner( @Qualifier("PacmanGameQualifier") Gameconsole game)
	{
		this.game =game;
		
	}
	
	public void run()
	{
		System.out.println("Running game : "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
