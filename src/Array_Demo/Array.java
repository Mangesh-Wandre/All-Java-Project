package Array_Demo;

public class Array {
public static void main(String[] args) {
	
	int [] a= {1,2,3,4,5,6,7,8,9,10};
	int [] b=new int[4];
	b[0]=11;
	b[1]=12;
	b[2]=13;
	b[3]=14;
	
	System.out.println(a[4]);
	System.out.println(b[1]);
	System.out.println(a.length);
	System.out.println(b.length);
	System.out.println(" Array A");
	for(int i=0;i<a.length;i++)
	{
		System.out.print("  "+a[i]);
	}
	System.out.println("\nReverse Array A");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print("  "+a[i]);
	}
}
}
