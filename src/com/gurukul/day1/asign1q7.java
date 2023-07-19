package com.gurukul.day1;

import java.util.Scanner;

public class asign1q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int hr=n/100;
		System.out.println(hr);
		int min=n%100;
		System.out.println(hr);
		int hr12=hr%12;
		if(hr>12)
		{
			System.out.println("pm");
		}
		else {
			System.out.println("am");
		}
		System.out.println(hr12);
		System.out.println(hr12+":"+min);
		
	}

}
