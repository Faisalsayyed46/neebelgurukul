package day2;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a x ");
		double x=sc.nextDouble();
		x=Math.toRadians(x);
		double sum=0,f=1,numerator=x;
		for(double i=1;i<20;i++)
		{
			f=f*i;
			if(i%2!=0)
			{
				sum=sum+numerator/f;
				numerator=-numerator*x*x;
			}
		}
		System.out.println(sum);
		System.out.println(Math.sin(x));
	}

}
