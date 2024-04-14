package edu.numbers;

public class FactorOfNumber {

	public static void main(String[] args) {
		int n=8;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
/*A factor of a number which divides 
into it exactly without leaving a remainder.

*/