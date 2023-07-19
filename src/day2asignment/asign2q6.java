package day2asignment;

import java.util.Scanner;

public class asign2q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int lower=sc.nextInt();
		int upper=sc.nextInt();
		int first=0,second=1;
		for(int i=1;i<=upper;i++) {
			
			if(first>=lower && first<upper)
			{
			System.out.print(first+" ");
			}
			int third=first+second;
			first=second;
			second=third;
	}
	}
}
