package day3;

import java.util.Scanner;

public class gcdothermethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int mod;
		while(x%y!=0)
		{
			mod=x%y;
			x=y;
			y=mod;
		}
		System.out.println("GCD "+y);
			

	}

}
