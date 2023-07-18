package com.gurukul.day1;

import java.util.Scanner;

public class salary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a salary");
		double sal=sc.nextDouble();
		if(sal<30000)
//			if is false then we skip the statement after if
		sal=sal*1.05;
		System.out.println(sal);
	}

}
