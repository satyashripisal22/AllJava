package edu.OneDimensionArray;

public class PrintSumOfEvenNoFromArray {

	public static void main(String[] args) {
		int arr[] = {5,12,4,21,8,2,3,7,9,11};
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				sum = sum + arr[i];
			}
		System.out.println("Sum of Even No:"+sum);
	}

}


/*sum of odd no if(arr[i]%2!=0)
 * sum of 2 digit no if(arr[i]>9 && arr[i]>100)
 * sum of positive no if(arr[i]>0)*/
 