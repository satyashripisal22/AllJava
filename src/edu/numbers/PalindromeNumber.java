package edu.numbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=121;
		int m=n;
		int sum = 0;//initialization
	while(n!=0) {
		int d= n%10;
		sum = sum*10+d;//logic
		n=n/10;
	}
	if(sum==m) {//check
		System.out.println("Yes");
	}else {
		System.out.println("no");
	}

	}

}
