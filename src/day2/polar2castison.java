package day2;

import java.util.Scanner;

public class polar2castison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of theta");
		double theta=sc.nextDouble();
		theta=Math.toRadians(theta);
		System.out.println("Enter value of radius");
		double radius=sc.nextDouble();
		double x=radius*Math.cos(theta);
		double y=radius*Math.sin(theta);
		System.out.println("x="+x+"y="+y);
		
	}

}
