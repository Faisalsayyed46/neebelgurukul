package day2asignment;

import java.util.Scanner;

public class asign2q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a x ");
		double x=sc.nextDouble();
		System.out.println("Enter a limit ");
		double limit=sc.nextDouble();
		
		x=Math.toRadians(x);
		
		double sum=1,f=1,numerator=-(Math.pow(x, 2));
		for(double i=1;i<limit;i++)
		{
			f=f*i;
			if(i%2==0)
			{
				sum=sum+(numerator/f);
				numerator=-numerator*x*x;
			}
		}
		System.out.println(sum);
		System.out.println(Math.cos(x));
	}

}
