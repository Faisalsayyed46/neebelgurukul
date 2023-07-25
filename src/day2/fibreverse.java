package day2;

import java.util.Scanner;

public class fibreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number : ");
         int n = sc.nextInt();

        
         int[] fib = new int[n];
         fib[0] = 0;
         fib[1] = 1;
         
         for (int i = 2; i < n; i++) {
             fib[i] = fib[i - 2] + fib[i - 1];
         }

         for (int i = n - 1; i >= 0; i--) {
             System.out.print(fib[i]+" ");
         }
	}

}
