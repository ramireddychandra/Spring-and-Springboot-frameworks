package com.javatest.Springboot.SearchingAlgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnotherComplexAlgo implements SortingAlgorithm {
	@Autowired
	@Qualifier("BubbleSortTech")
	private SortingAlgorithm AlgoSort;
	
	public AnotherComplexAlgo() {
		System.out.println("AnotherComplexAlgo" + AlgoSort);
	}
//	
//	public AnotherComplexAlgo(SortingAlgorithm SortM) {
//		System.out.println("AnotherComplexAlgo single constructor" +SortM);
//	}
	
	public String toString()
	{
		return "Object "+ AlgoSort;
		
	}
		
}
