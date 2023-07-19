package day2;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0,f=1,numerator=1;
		for(double i=1;i<20;i++)
		{
			f=f*i;
			if(i%2!=0)
			{
				sum=sum+numerator/f;
				numerator=-numerator;
			}
		}
		System.out.println(sum);

	}

}
