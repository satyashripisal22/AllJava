package edu.OneDimensionArray;

public class PrintTwoDigitNoFromArray {

	public static void main(String[] args) {

		int arr[] = {5,12,4,21,8,2,3,7,9,11};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>9 && arr[i]<100)
				System.out.println(arr[i]);
		}

	}

}
/*Positive no ->if(arr[i]>0)
 * Divisible by 5 -> if(arr[i]%5==0)
 * Ending with 7 -> if(arr[i]%10==7)*/
