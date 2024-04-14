package edu.OneDimensionArray;

public class PrintProductOfEvenNoFromArray {

	public static void main(String[] args) {
		int arr[] = {5,12,4,21,8,2,3,7,9,11};
		double prod = 1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				prod = prod*arr[i];
		}
		System.out.println("Product of Even No:"+prod);

	}

}
/*Product of odd no if(arr[i]%2!=0)
 *Product of 2 digit no if(arr[i]>9 && arr[i]>100)
 *Product of positive no if(arr[i]>0)*/