package com.java.Inheritance;

public class Child_3_class extends Parent_class
{
	int a=30;
	public void Child_3_Method()
	{
		int a=40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
public static void main(String[] args) 
{
	Child_3_class a=new Child_3_class();
	a.Child_3_Method();
	
}

}
