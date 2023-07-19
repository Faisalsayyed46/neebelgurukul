package day2asignment;

import java.util.Scanner;

public class asign2q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value of x ");
		int x=sc.nextInt();
		System.out.println("Enter a value of x ");
		int y=sc.nextInt();
		if(x>0 && y>0)
			System.out.println(x + "and" + y + "1st quadrant");
		else if(x<0 && y>0)
			System.out.println(x + "and" + y + "2nd quadrant");
		else if(x<0 && y<0)
			System.out.println(x + "and" + y + "3rd quadrant");
		else if(x>0 && y<0)
			System.out.println(x + "and" + y + "4th quadrant");
		else if(x==0 && y>0)
			System.out.println(x + "and" + y + "Y axis");
		else if(x>0 && y==0)
			System.out.println(x + "and" + y + "X axis");
		else
			System.out.println("lies in the origin");
			
	}

}
