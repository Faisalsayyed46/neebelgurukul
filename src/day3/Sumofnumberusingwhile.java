package day3;

import java.util.Scanner;

public class Sumofnumberusingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int m=n%10;
			n=n/10;
			sum=sum+m;	
		}
		System.out.println(sum);
	}

}
