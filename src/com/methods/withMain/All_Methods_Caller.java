package com.methods.withMain;
import com.methods.withoutMain.Methods_DiffClass_DiffPack;

public class All_Methods_Caller {

	public static void main(String[] args) {
		
		All_Methods_Caller obj=new All_Methods_Caller();
		obj.m2();
		m1();
		
		Methods_DiffClass_SamePack obj1=new Methods_DiffClass_SamePack();
		obj1.m2();
		obj1.m4();
		Methods_DiffClass_SamePack.m1();
		Methods_DiffClass_SamePack.m3();
		
		
		Methods_DiffClass_DiffPack obj2=new Methods_DiffClass_DiffPack();
		obj2.m2();
		obj2.m6();
		Methods_DiffClass_DiffPack.m1();
		Methods_DiffClass_DiffPack.m5();

	}
	public static void m1()
	{
		System.out.println("This is static method m1 from Main class");
	}
	public void m2()
	{
		System.out.println("This is non-static method m2 from Main class");
	}

}
