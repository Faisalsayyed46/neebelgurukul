package day2;

import java.util.Scanner;

public class switchex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for square");
		System.out.println("Enter 2 for circle");
		System.out.println("Enter 3 for triangle");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Enter side of a square");
			int side=sc.nextInt();
			int areaofsquare=side*side;
			System.out.println("Area of square"+areaofsquare);
		break;
		case 2:
			System.out.println("Enter side of a circle");
			int r=sc.nextInt();
			double areaofcircle=3.14*r*r;
			System.out.println("Area of circle"+areaofcircle);
		break;
		case 3:
			System.out.println("Enter side of a triangle");
			int b=sc.nextInt();
			int h=sc.nextInt();
			double areaoftriangle=0.5*b*h;
			System.out.println("Area of square"+areaoftriangle);
		break;
		default:
			System.out.println("Please enter a valid number");
		}

	}

}
