package com.gurukul.day1;

import java.util.Scanner;

public class asign1q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int v1=n%10;
//		System.out.println(v1);
		int v2=(n/10)%10;
//		System.out.println(v2);
		int v3=n/100;
//		System.out.println(v3);
		int c1=v1*v1*v1;
		int c2=v2*v2*v2;
		int c3=v3*v3*v3;
		sum =c1+c2+c3;
		System.out.println("Sum"+sum);
		
		if(sum==n)
			System.out.println("It is a Armstrong number");
		else
			System.out.println("It is not a Armstrong number");	

//		int sum=0 ,ogno=153;
//		int d1=n%10;
//		int c1=(int)Math.pow(d1,3);
//		n=n/10;
//		int d2=n%10;
//		int c2=(int)Math.pow(d2,3);
//		n=n/10;
//		int d3=n%10;
//		int c3=(int)Math.pow(d3,3);
//		sum=c1+c2+c3;
//		System.out.println("Armstrong number " + sum);
//		if(n<=sum)
//			System.out.println("It is a Armstrong number");
//			else
//				System.out.println("It is not a Armstrong number");	
		
		
	}
}
