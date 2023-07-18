package com.gurukul.day1;

import java.util.Scanner;

public class deducttax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a salary");
		double sal=sc.nextDouble();
		double tax=0;
		if(sal>1500000)
			tax=0.3*sal;
		else if(sal>1000000)
			tax=0.2*sal;
		else if(sal>750000)
			tax=0.1*sal;
		System.out.println("salary" + sal);
		System.out.println("tax" + tax);
		System.out.println("after tax" + (sal-tax));
		
		
	}

}
