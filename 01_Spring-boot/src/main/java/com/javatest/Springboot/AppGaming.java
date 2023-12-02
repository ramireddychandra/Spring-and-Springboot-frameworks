package com.javatest.Springboot;

import com.javatest.Springboot.game.GameRunner;
import com.javatest.Springboot.game.MarioGame;

public class AppGaming {

	public static void main(String[] args) {
		
		var MarioGame = new MarioGame();
		var GameRunner = new GameRunner(MarioGame);
		
		GameRunner.run();

	}

}
