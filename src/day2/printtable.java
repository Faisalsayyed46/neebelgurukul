package day2;

import java.util.Scanner;

public class printtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int r=n*i;
			System.out.println("table" + n +"*" + i +" = "+ r);
		}
		
	}

}
