package day3;

import java.util.Scanner;

public class Gcd {
//find GCD number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		while(x!=y)
		{
			if(x>y)
			{
				x=x-y;
			}
			else
			{
				y=y-x;
			}
		}
		System.out.println("GCD is " + x);	

	}

}
