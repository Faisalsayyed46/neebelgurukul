package day1assignment;

import java.util.Scanner;

public class asign1q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int r=Math.max(n1, n2);
		int greater=Math.max(r, n3); 
		System.out.println("Greater number is " + greater);
	}

}
