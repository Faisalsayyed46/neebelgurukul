package day3;

import java.util.Scanner;

public class Armstrongnousingwhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int count=0;
		double total=0;
		int n=counttotal;
		while(n!=0) {
			count++;
			n=n/10;
		}
		while(n!=0)
		{
			double a=a%10;
			a=Math.pow(a,count);
			total=total+a;
		}
		if(n==total)
			System.out.println("armstrong");
		}
	}

