package com.javatest.Springboot.SearchingAlgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RadixSort implements SortingAlgorithm {
	@Autowired
	
	public RadixSort() {
		System.out.println("Radix" );
	}
}
