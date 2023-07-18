package day2;

import java.util.Scanner;

public class bitconersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value of x ");
		int x=sc.nextInt();
		System.out.println("Enter a value of n ");
		int n=sc.nextInt();
		System.out.println((x>>(n-1))&1);

	}

}
