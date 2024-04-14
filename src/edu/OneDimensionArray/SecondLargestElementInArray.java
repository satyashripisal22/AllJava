package edu.OneDimensionArray;

import java.util.Arrays;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int arr[] = {5,12,4,21,8,2,3,7,9,11};
		
		 Arrays.sort(arr);
		 
		 System.out.println(arr[arr.length-2]);
	}

}

