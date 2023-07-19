package day2asignment;

import java.util.Scanner;

public class asign2q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a x ");
		double x=sc.nextDouble();
		x=Math.toRadians(x);
		double sum=1,f=1;
		for(double i=1;i<=10;i++)
		{
			f=f*i;
			sum=sum+(Math.pow(x, i))/f;
		}
		System.out.println(sum);
		System.out.println(Math.exp(x));
	}
	}

