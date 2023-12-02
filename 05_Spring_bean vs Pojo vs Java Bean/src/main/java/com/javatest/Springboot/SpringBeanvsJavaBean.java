package com.javatest.Springboot;

import java.io.Serializable;

class Pojo
{
	private String name;
	private int val;
	
	public String toString() {
		return name+" "+val;
	}
	
}

class JavaBean implements Serializable
{ // EJB
	
	private int Number;
	private String name;
	
	// 1 - no-arg constructor
	public JavaBean() {
		
	}
// 2 - setters and getters
	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}

public class SpringBeanvsJavaBean {
	public static void main(String args[])
	{
		Pojo pojo = new Pojo();
		System.out.print(pojo);
	}

}
