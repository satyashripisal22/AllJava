package edu.OneDimensionArray;

public class CountEvenNoFromArray {

	public static void main(String[] args) {

		int arr[] = {5,12,4,21,8,2,3,7,9,11};
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) 
			count++;
		}
		System.out.println(count);
	}

}
/*count of number divisible by 5 if(arr[i]%5==0)
 *count 3 digit no if(arr[i]>99 && arr[i]<1000
 *count of nos ending with 5 if(arr[i]%10==5)
 */