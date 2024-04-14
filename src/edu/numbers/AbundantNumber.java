package edu.numbers;

public class AbundantNumber {
/*Here sumof factor is greater than the no. itself
 * e.g.12. Factors 1,2 3, 4,6 =16>12 
 */
	public static void main(String[] args) {
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		if(sum>n) {
			System.out.println("Abundant Number");
		}else {
			System.out.println("no");
		}

	}

}
