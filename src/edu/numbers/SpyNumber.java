package edu.numbers;

public class SpyNumber {

	public static void main(String[] args) {
		int n=123;
		int m=n;
		int sum =0, prod =1;
		while(n!=0) {
			int d= n%10;
			sum =sum+d;
			prod = prod*d;
			n=n/10;
		}
		if(sum==prod)
			System.out.println("spy no");
		else
			System.out.println("no");

	}

}
//spy number means sum its digits equals the product of the digits
//e.g. 123. 1+2+3=1*2*3