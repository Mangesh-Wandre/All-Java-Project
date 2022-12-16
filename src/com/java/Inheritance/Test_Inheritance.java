package com.java.Inheritance;

public class Test_Inheritance {
	
	int a=30;
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40;

	System.out.println(a);
		//System.out.println(super.a);
		Child_1_class C1=new Child_1_class();
		Child_2_class C2=new Child_2_class();
		Child_3_class C3=new Child_3_class();
		
		
		C1.Child_1_Method();
		C1.Parant_Method();
		
		
		C2.Child_2_Method();
		C2.Parant_Method();
		
		C3.Child_3_Method();
		C3.Parant_Method();

	}

}
