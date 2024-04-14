package edu.numbers;

public class PrintAlldigitsOfaNumberOnDifferentLines {

	public static void main(String[] args) {
		int n = 268;
		int m=n;
		while(n!=0) {
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}

	}

}
