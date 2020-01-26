package Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

	public static int[] sort(int[] arr) {
		return sorthelper(arr, arr.length - 1);
	}

	public static int[] sorthelper(int[] array, int iterations) {
	
		//first loop is for a counter i
		for (int i = 0; i < iterations; i++) { 
			//second loop will actually iterate through the array and compare elements
			//The largest number will move to the right, the loop will decrease by 1
			//Loop incrementally decreases part of the array to iterate through, until sorted
			for (int j =0; j < iterations - i; j++) { 
				if (array[j] > array[j+1]) { 
					swap(j, j+1, array);
				}
			}
		}
		
		return array;
	
	}
	//swap method for two numbers to be swapped
	public static void swap(int firstNumber, int secondNumber, int[] array) {

		int temp = array[firstNumber];
		array[firstNumber] = array[secondNumber];
		array[secondNumber] = temp;

	}

	public static void main(String[] args) {
		int[] array = new int[] { 10,9,8,7,6,5,4,3,2,1 };
		sort(array);
		System.out.println(Arrays.toString(array));
	}
}
