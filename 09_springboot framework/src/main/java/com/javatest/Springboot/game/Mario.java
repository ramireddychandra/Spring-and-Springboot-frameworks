package com.javatest.Springboot.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements Gameconsole{
	
	public void up()
	{
		System.out.println("UP mario");
	}
	public void down()
	{
		System.out.println("down mario");
	}
	public void left()
	{
		System.out.println("left mario");
	}
	public void right()
	{
		System.out.println("right mario");
	}
	

}
