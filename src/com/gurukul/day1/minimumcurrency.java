package com.gurukul.day1;

import java.util.Scanner;

public class minimumcurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a amount");
		int am=sc.nextInt();
		int twoth=am/2000;
		am=am%2000;
		System.out.println(twoth+"*2000" + "=" +(twoth*2000));
		int fivehu=am/500;
		am=am%500;
		System.out.println(fivehu+"*500" + "=" +(fivehu*500));
		int twohu=am/200;
		am=am%200;
		System.out.println(twohu+"*200" + "=" +(twohu*200));
		int hun=am/100;
		am=am%100;
		System.out.println(hun+"*100" + "=" +(hun*100));
		int fifty=am/50;
		am=am%50;
		System.out.println(fifty+"*50" + "=" +(fifty*50));
		int twenty=am/20;
		am=am%20;
		System.out.println(twenty+"*20" + "=" +(twenty*20));
		int ten=am/10;
		am=am%10;
		System.out.println(ten+"*10" + "=" +(ten*10));
		int five=am/5;
		am=am%5;
		System.out.println(five+"*5" + "=" +(five*5));
		int two=am/2;
		am=am%2;
		System.out.println(two+"*2" + "=" +(two*2));
		int one=am/1;
		am=am%1;
		System.out.println(one+"*1" + "=" +(one*1));

	}

}
