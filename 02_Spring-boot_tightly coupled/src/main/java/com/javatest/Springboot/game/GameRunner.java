package com.javatest.Springboot.game;

public class GameRunner {

		MarioGame game; // need to change for every game
		
		public GameRunner(MarioGame game)
		{
			this.game=game;
		}
		
		public void run()
		{
			System.out.println("Running game : "+ game);
			game.up();
		}

}
