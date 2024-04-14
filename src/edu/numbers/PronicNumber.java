package edu.numbers;

public class PronicNumber {

	public static void main(String[] args) {


		int n=56;
		int fact=0;
		for(int i=1;i<n;i++) {
			if(i*(i+1)==n)
				fact=i;
		}
		if(fact!=0)
			System.out.println("Pronic");
		else
			System.out.println("Not");

	}

}
/*Pronic number is the product of two consecutive integer, n(n+1)
e.g. 56=7*8*/