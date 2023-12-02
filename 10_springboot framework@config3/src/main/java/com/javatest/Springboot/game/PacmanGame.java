package com.javatest.Springboot.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGameQualifier")
public class PacmanGame implements Gameconsole{
	
	public void up()
	{
		System.out.println("UP");
	}
	public void down()
	{
		System.out.println("down");
	}
	public void left()
	{
		System.out.println("left");
	}
	public void right()
	{
		System.out.println("right");
	}
	

}
