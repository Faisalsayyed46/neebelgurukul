package com.gurukul.day1;

import java.util.Scanner;

public class asign1q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of days");
		int n=sc.nextInt();
		int year=n/365;
		n=n-365*year;
		int month=n/30;
		n=n-30*month;
		int week=n/7;
		n=n-7*week;
		System.out.println(year + "Years:"+month+"months"+week+"weaks"+n+"days");	
	}

}
