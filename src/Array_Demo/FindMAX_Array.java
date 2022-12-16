package Array_Demo;

import java.util.Scanner;

public class FindMAX_Array {

	public static void main(String[] args) {
		int size;
		
		System.out.println("Enter Size of Array :->");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int [] a=new int[size];
		System.out.println("Enter Array Elemets:-"+ " of SIZE  "+size+" :->");
		for(int i=0;i<size;i++)
		{
			 a[i]=s.nextInt();
		}
		System.out.println("Array Elemets:-"+ " of SIZE  "+size+" :->");
		for(int i=0;i<size;i++)
		{
			 System.out.print("   "+a[i]);
		}


	}

}
