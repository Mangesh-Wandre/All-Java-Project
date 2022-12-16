package com.methods.withMain;

class Demo_Constructor
{
	int a,b;
	Demo_Constructor()
	{
		System.out.println("A:-"+a+" \nB:-"+b);
				
	}
	
	Demo_Constructor(int a,int b)
	{
		
		System.out.println("A:-"+a+" \nB:-"+b);
				
	}
	
	
}



public class Test_Constructor {

	public static void main(String[] args) {
		
		Demo_Constructor obj=new Demo_Constructor();
		Demo_Constructor obj1=new Demo_Constructor(50,60);
		
			}

}
