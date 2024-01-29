package com.javatest.Springboot.SearchingAlgo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BubbleSortTech")
public class BubbleSort implements SortingAlgorithm {
	public BubbleSort() {
		System.out.println("BubbleSort");
	}
}
