package com.methods.withMain;

import com.methods.withoutMain.Sub_Sub_Operations;

public class Oprations 
	{

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oprations obj=new Oprations();
		obj.Addition(45,68);
		
		Sub_Operations obj1=new Sub_Operations();
		obj1.Substraction(10.10f,20.90f);
		
		Sub_Sub_Operations obj2=new Sub_Sub_Operations();
		float c=obj2.Multipication(10,20);
		System.out.println("Multiplication 2 numbers is :->"+c);
	}

	public void Addition(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition of "+a+" & "+b+" :->"+c);
	}
}
