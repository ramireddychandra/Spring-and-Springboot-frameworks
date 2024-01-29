package com.javatest.Springboot.db;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MySqlDatasource implements Datasource {

	@Override
	public int[] retriveData() {
		return new int[] {11,22,33,44,55};
	}

}
