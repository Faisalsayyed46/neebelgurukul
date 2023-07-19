package day2;

import java.util.Scanner;

public class printallunicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to covert in unicode");
		int lower=sc.nextInt();
		int upper=sc.nextInt();
		for(int i=lower;i<=upper;i++)
		{
			char r= (char)i;
			System.out.println(r+"-"+i);
		}
	}

}
