package com.java.Examples.Programs;

import java.util.Scanner;

public class Find_Prime {

	
	static boolean Prime(int no)
	{														
	for(int i=2;i<=no/2;i++ )
	{
		if(no%i==0)
			return false;
	}
			
	return true;
	}

	public static void main(String[] args) 
	{
		
		//System.out.println("Enter any no. to Find No. is Prime or Not");
//Scanner sc = new Scanner(System.in);
	int no=107;
	boolean IsP=Prime(no);
	if(IsP==true)
		System.out.println("No is Prime");
	else 
		System.out.println("No is Not Prime");

	
}
	}