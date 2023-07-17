package com.gurukul.day1;

import java.util.Scanner;

public class converter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter KM");
		double km=sc.nextDouble();
		double m=km*1000;
		double cm=m*100;
		double inch=cm/2.54;
		double ft=inch/12;
		System.out.println("Meter"+ m);
		System.out.println("centimetr"+ cm);
		System.out.println("Inch"+ inch);
		System.out.println("feet"+ ft);

	}

}
