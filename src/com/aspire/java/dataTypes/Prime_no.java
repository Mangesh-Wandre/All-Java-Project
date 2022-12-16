package com.aspire.java.dataTypes;

import java.util.Scanner;

public class Prime_no {

	static boolean Isprime(int n)
	{
		for(int i=2; i<n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no.");
		a=sc.nextInt();
		boolean prime=Isprime(a);
		if(prime==true)
		System.out.println("Num is prime");
		else 
			System.out.println("Num is not prime");
		

	}

}
