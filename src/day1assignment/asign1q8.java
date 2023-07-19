package day1assignment;

import java.util.Scanner;

public class asign1q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name ");
		int name=sc.nextInt();
		System.out.println("Enter a unit");
		int unit=sc.nextInt();
		if(unit<=100)
		{
			int charge=unit*4;
		}
		else if(unit<=300)
		{
			unit=unit-100;
			charge=(100*4)+(unit*5);
		}
		else
		{
			
		}
	}

}
