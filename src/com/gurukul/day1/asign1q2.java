package com.gurukul.day1;

import java.util.Scanner;

public class asign1q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 digits");
		int no=sc.nextInt();
		int digit1=no%100;
		int digit2=(no/100);
		System.out.println("reverse => "+ digit1 + digit2 );
	}

}
