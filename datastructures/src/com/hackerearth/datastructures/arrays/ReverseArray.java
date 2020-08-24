package com.hackerearth.datastructures.arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int START_INDEX = 0;
		System.out.println("Enter the input Array Size");
		int inpArraySize = sc.nextInt();
		int[] inputArray = new int[inpArraySize];
		
		System.out.println("Enter "+inpArraySize+" number of elements");
		// Add elements to inputArray[] of size 
		for(int i=0; i < inpArraySize; i++) {
			inputArray[i] = sc.nextInt();
		}
		
		sc.close();
		
		reverseArray(inputArray, START_INDEX, inpArraySize-1);
		
		printArray(inputArray, inputArray.length);
		
	}
	
	/* Function to reverse inputArray[] from start to end */
	static void reverseArray(int[] inputArray, int startIndex, int endIndex) {
		int temp;
		if(startIndex >= endIndex) return;
		
		temp = inputArray[startIndex];
		inputArray[startIndex] = inputArray[endIndex];
		inputArray[endIndex] = temp;
		
		reverseArray(inputArray, startIndex+1, endIndex-1);
	}
	
	/* Utility function to print the array elements */
	static void printArray(int[] inputArray, int size) {
		for (int i=0; i < size; i++) 
            System.out.print(inputArray[i] + " "); 
        System.out.println("");
	}
}
