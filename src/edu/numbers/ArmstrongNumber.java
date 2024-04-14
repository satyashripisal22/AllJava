package edu.numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	 public static void main(String[] args) {
	        /*int temp, digit, cubeSum = 0,num;
	        
	        System.out.println("Enter the number:");
	        Scanner sc = new Scanner(System. in );
	        num = sc.nextInt();
	        temp = num;
	        while (num!= 0)
	        {
	            digit = num % 10;//3 5 1
	            cubeSum += Math.pow(digit, 3);//0+27, 27+125=152,152+1=153
	            num /= 10;//15, 1 0
	        }
	        if(cubeSum == temp)
	            System.out.println(temp+ " is an Armstrong number");
	        else
	            System.out.println(temp+ " is not an Armstrong number");*/
		 
		 int n = 153;
			int rem;
			int sum = 0;
			for(int i=n;i>0;i=i/10) {
				rem = i%10;
				sum = sum + rem*rem*rem;
			}
				if(sum==n) {
					System.out.println("no is Armstrong");
					}
				else {
					System.out.println("no is not Armstrong");
				}
	    }
	
}

