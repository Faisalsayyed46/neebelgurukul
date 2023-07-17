package com.gurukul.day1;

import java.util.Scanner;

public class reverseof3digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 digits");
		int no=sc.nextInt();
		int digit1=no%10;
		int digit2=(no/10)%10;
		int digit3=no/100;
		int total=digit1+digit2+digit3;
		int reverse=digit1*100+digit2*10+digit3;
		int sum=reverse+no;
		System.out.println("Total => "+ total);
		System.out.println("reverse => "+ reverse );
		System.out.println("Sum of 3 digits => "+ sum);
		
		


	}

}
