package day3;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
//		int n=sc.nextInt();
		boolean isprime=true;
		for(int n=2;n<=1000;n++)
		{
			 isprime=true;	
//		for(int i=2;i<n;i++) 
// above for will also run but to get the loop run less for efficiency of program will put sqrt
		 for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				isprime=false;
				break;
			}
			
		}
		if(isprime)
			System.out.println("Prime number" + n);
//		else {
//			System.out.println("Not a Prime number");
//		}
		}
	}

}
