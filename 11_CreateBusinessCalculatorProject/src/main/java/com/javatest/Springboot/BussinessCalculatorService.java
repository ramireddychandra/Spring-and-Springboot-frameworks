package com.javatest.Springboot;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.javatest.Springboot.db.Datasource;
@Component
public class BussinessCalculatorService {
	
	private Datasource datasource;
	
	public BussinessCalculatorService(Datasource datasource)
	{
		super();
		this.datasource=datasource;
	}
	
	public int findMax()
	{
		return Arrays.stream(datasource.retriveData()).max().orElse(0);
	}

}
