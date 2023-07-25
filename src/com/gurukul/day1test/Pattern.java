package com.gurukul.day1test;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, i, j, s = 2;  
	     System.out.print("Enter the number: "); 
	     Scanner sc = new Scanner(System.in);  
	     r = sc.nextInt();  
	     s = r - 1;  
	     for (i = 1; i<= r; i++)  
	     {  
	     for (j = 1; j<= s; j++)  
	     {  
	     System.out.print(" ");  
	     }  
	     s--;  
	     for (j = 1; j <= 2 * i -1; j++)  
	     { 
	     if(j%2!=0)
	     System.out.print(" *");  
	     }  
	     
	     System.out.println("  ");  
	     }  
	     s = 2;  
	     for (i = 1; i<= r - 1; i++)  
	     {  
	     for (j = 1; j<= s; j++)  
	       
	     {  
	     System.out.print(" ");  
	     }  
	}

}
}
