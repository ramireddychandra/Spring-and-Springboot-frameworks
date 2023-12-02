package com.javatest.Springboot.game;

public class GameRunner {
	
	private Gameconsole game;
	
	
	public GameRunner(Gameconsole game)
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
