package edu.numbers;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum =sum+i;
			}
		}
		if(sum==n) {
			System.out.println("It is Perfect number");
		}else {
			System.out.println("It is not perfect number....");
		}

	}

}
/*A perfect number is equal to sum of its divisors or factors
except itself e.g.6=1+2+3*/

