package com.gurukul.day1;

import java.util.Scanner;

public class areaoftriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of triangle");
		double s=sc.nextDouble();
		double a=(Math.sqrt(3)*Math.pow(s, 2))/4;
		System.out.println("Area of triangle"+ a);

	}

}
