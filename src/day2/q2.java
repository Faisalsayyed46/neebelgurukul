package day2;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a n ");
		int n=sc.nextInt();
		double sum=0;
		for(double i=1;i<=n;i++)
		{
			sum=sum+1.0/Math.pow(i, 2);
		}
		System.out.println(sum);
	}

}
