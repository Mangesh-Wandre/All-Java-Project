package com.aspire.java.dataTypes;

import java.util.Scanner;

public class DataTypes_1 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		sc = new Scanner(System.in);
		System.out.println("Enter any 2 numbers for Addition:->");
		System.out.println("Enter any First numbers for Addition:->");
		a=sc.nextInt();
		System.out.println("Enter any First numbers for Addition:->");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
		System.out.println("Radix of "+sc.radix());
	

	}

}
