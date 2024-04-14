package edu.numbers;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=5;
		int count =0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
//Prime number is a number divisible by 1 and itself.