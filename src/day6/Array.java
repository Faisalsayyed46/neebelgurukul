package day6;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array ");
		int n=sc.nextInt();
		double sum=0;
		double x[]=new double[n];
		for(int i=0;i<x.length;i++)
		{
			double y=sc.nextDouble();
			x[i]= y;
			sum=sum+y;
		}
		System.out.println("Sum of array"+sum);
		
		double avg = sum/x.length;
		System.out.println("Avg of average" +avg);
		
		double var=0;
		for(int i=0;i<x.length;i++) {
		
			var += Math.pow(x[i]-avg, 2);
		}
		System.out.println("Avg of variant" + var);
		
		double standarddeviation= Math.sqrt(var);
		System.out.println("Avg of standard deviation" +standarddeviation);
		
	}

}
