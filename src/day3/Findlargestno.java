package day3;

import java.util.Scanner;

public class Findlargestno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int large=0;
		while(n!=0)
		{
			int mod=n%10;
			if(mod>large)
				large=mod;
			n=n/10;
		}	
		System.out.println(large);

	}

}
