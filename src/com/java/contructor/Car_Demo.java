package com.java.contructor;

class Car
{
 String car_owner,car_color,car_name,car_Manufacture,car_type;
	
	public void Car_Info()
	{
		System.out.println("----------------------------------------------");
		System.out.println("Car Owner Name :->  "+car_owner+"             |");
		System.out.println("Car Color :->       "+car_color+"                     |");
		System.out.println("Car Manufacture :-> "+car_Manufacture+"                     |");
		System.out.println("Car Type :->        "+car_type+"                  |");
		System.out.println("----------------------------------------------");
	}
		
}

public class Car_Demo 

{

	public static void main(String[] args)
	{
		
		Car obj=new Car();
		obj.car_owner="Mangesh Wandre";
		obj.car_color="Yellow";
		obj.car_Manufacture="Maruti";
		obj.car_type="Auto Gare";
		obj.Car_Info();
		Car obj1=new Car();
		obj1.car_owner="Ankita Sonwane";
		obj1.car_color="White ";
		obj1.car_Manufacture="Hundai";
		obj1.car_type="Manu Gare";
		obj1.Car_Info();
		Car obj3=new Car();
		obj3.car_owner="Deepa Bhosale ";
		obj3.car_color="Green ";
		obj3.car_Manufacture="BMW   ";
		obj3.car_type="Auto Gare";
		obj3.Car_Info();

		
	}

	
}
