package day2asignment;

import java.util.Scanner;

public class asign2q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of radius1");
		double radius1=sc.nextDouble();
		System.out.println("Enter value of radius2");
		double radius2=sc.nextDouble();
		System.out.println("Enter value of theta1");
		double theta1=sc.nextDouble();
		theta1=Math.toRadians(theta1);
		System.out.println("Enter value of theta2");
		double theta2=sc.nextDouble();
		theta2=Math.toRadians(theta2);
		double x1=radius1*Math.cos(theta1);
		double y1=radius1*Math.sin(theta1);
		double x2=radius2*Math.cos(theta2);
		double y2=radius2*Math.sin(theta2);
		double x3=x1+x2;
		double y3=y1+y2;
		double r3=Math.sqrt(Math.pow(x3,2)+Math.pow(y3,2));
		double theta3=Math.atan2(y3,x3);
		theta3=Math.toDegrees(theta3);
		System.out.println("r3="+r3+"theta3="+theta3);

	}

}
