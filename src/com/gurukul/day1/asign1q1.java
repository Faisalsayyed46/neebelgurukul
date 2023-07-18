package com.gurukul.day1;

import java.util.Scanner;

public class asign1q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int millisec=7000234;
		int seconds=millisec/1000;
		int min=seconds/60;
		int hr=min/60;
		seconds=seconds%60;
		min=min%60;
		System.out.println(hr+":"+min+":"+seconds);
	}

}
