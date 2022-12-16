package com.aspire.java.dataTypes;

import java.util.Scanner;

public class Find_GCD {

	static int _m;
	static int $n;
	
		static int GCD(int m, int n)
		{
		while(m!=n)
		{
	if(m>n)
		m=m-n;
	else n=n-m;
	
	
		}
		return m;
		//System.out.println("Enter any 2 no.s for finding GCD");
		}	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	//		int a,b;
			Scanner sc=new Scanner(System.in);
			_m=sc.nextInt();
			$n=sc.nextInt();

		System.out.println("GCD "+GCD(_m,$n));

	}

}
