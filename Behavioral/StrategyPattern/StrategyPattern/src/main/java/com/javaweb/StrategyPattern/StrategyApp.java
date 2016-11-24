package com.javaweb.StrategyPattern;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class StrategyApp {
	public static void main(String[] args) {
		StrategyClient client = new StrategyClient();
		
		int []array1 = {1,-2,4,-10,2,3,1,10,7};
		client.setSorting(new InsertionSort());
		client.sort(array1);
		
		int []array2 = {2,6,2,5,12,6,24,98,23,4};
		client.setSorting(new BubbleSort());
		client.sort(array2);
		
		int []array3 = {0,-1,3,-6,1,6,8,2,456,1,45,3};
		client.setSorting(new SelectionSort());
		client.sort(array3);
	}
}

class StrategyClient {
	Sorting sorting;

	public void setSorting(Sorting sorting) {
		this.sorting = sorting;
	}

	public void sort(int[] arr) {
		sorting.sort(arr);
	}
}

// Strategy
interface Sorting {
	void sort(int[] array);
}

class BubbleSort implements Sorting {

	public void sort(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("Bubble sort : \t\t" + Arrays.toString(array));
	}
}

class SelectionSort implements Sorting {
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minIndex = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
		System.out.println("Selection sort : \t" + Arrays.toString(array));
	}
}

class InsertionSort implements Sorting {

	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				int key = array[i];
				int j;
				for (j = i-1; (j >= 0) && (array[j] > key); j--) {
					array[j+1] = array[j];
				}
				array[j+1] = key; 
			}
		}
		System.out.println("Insertion sort : \t" + Arrays.toString(array));
	}

}