package edu.numbers;

public class DeficientNumber {

	public static void main(String[] args) {
	   int n=21;
	   int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum = sum+i;
		}
	}
	if(sum<n) {
		System.out.println("Defecient no");
	}else {
		System.out.println("not");
	}
}
}
/*Sum of factor is less than the no. itself 
 * e.g. 21 factors 1,3,7=11<21
 */