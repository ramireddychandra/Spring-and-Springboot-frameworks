package com.javatest.Springboot.db;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary

public class MongoDBDatasource implements Datasource {

	@Override
	public int[] retriveData() {
		return new int[] {1,2,3,4,5};
	}

}
