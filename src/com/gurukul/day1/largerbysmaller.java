package com.gurukul.day1;

import java.util.Scanner;

public class largerbysmaller {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c;
		if(a>b)
		{
			 c=a/b;
		}
		else
		{
			c=b/a;
		}
		System.out.println(c);

	}

}
