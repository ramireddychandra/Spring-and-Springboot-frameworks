package com.javatest.Springboot.game;

import org.springframework.context.annotation.Primary;

@Primary
public class SuperContrast implements Gameconsole{
	
	public void up()
	{
		System.out.println("UP SuperContrast");
	}
	public void down()
	{
		System.out.println("down SuperContrast");
	}
	public void left()
	{
		System.out.println("left SuperContrast");
	}
	public void right()
	{
		System.out.println("right SuperContrast");
	}
	

}
