package day2;

import java.util.Scanner;

public class powerofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a base ");
		int base=sc.nextInt();
		System.out.println("Enter a power");
		int power=sc.nextInt();
		int result=1;
		for(int i=1;i<=power;i++)
		{
			result=result*base;
		}
		System.out.println("Power of Number is" + " " +result);
		
	}

}
