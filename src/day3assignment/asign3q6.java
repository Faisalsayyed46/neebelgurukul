package day3assignment;

import java.util.Scanner;

public class asign3q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value n ");
		int n=sc.nextInt();
		System.out.println("Enter start ");
		int start=sc.nextInt();
		int first=0,second=1;
		int fib;
		int count=0;
		for(int i=1;;i++) {
			fib= first+second;
			first=second;
			second=fib;
			if(fib>= start)
			{
			System.out.print(fib+" ");
			count++;
			}
			if(count==n)
			{
				break;
			}
			
	}
	}
}