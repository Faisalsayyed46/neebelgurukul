package day3;

import java.util.Scanner;

public class tought {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=0;
		while (x!=0) {
			if (x%2!=0)
				a=a+y;
			x=x>>1;
			y=y<<1;
		}
		System.out.println(a);
		
		}

	}

