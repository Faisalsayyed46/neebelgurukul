package day3assignment;

import java.util.Scanner;

public class asign3q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int reverse=0;
		while(num>0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		while(reverse>0)
		{
			int digit=reverse%10;
			
			switch(digit)
			{
			case 0:
				System.out.print("zero ");
				break;
			case 1:
				System.out.print("one ");
				break;
			case 2:
				System.out.print("two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("seven ");
				break;
			case 8:
				System.out.print("eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
			}
			reverse=reverse/10;
		}

	}

}
