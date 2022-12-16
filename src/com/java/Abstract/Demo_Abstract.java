package com.java.Abstract;

abstract class DemoAbstract
{
	abstract void Method1();
	void Method2() {
		System.out.println("Normal method2 from abstract class");
	}
	
}


class ABT extends DemoAbstract
{
	void Method1()
	{
		System.out.println("Implimentation of abstract Method1");
	}
	void Method3()
	{
		System.out.println( "Method3 from ABT class ");
	}
}



public class Demo_Abstract {

	public static void main(String[] args) {
		
		ABT s=new ABT();
		s.Method1();
		s.Method2();
		s.Method3();
		
	}

}
