import java.util.Iterator;
import java.util.Scanner;

public class Prime_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low,high;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start Prime No. From:-");
		low=sc.nextInt();
		System.out.println("Enter Upto Prime No. :-");
		high=sc.nextInt();
	for (int i = low; i <= high; i++)
	{
		int count =0;
		for (int j =2; j < i; j++) 
		{
			if(i%j==0)	
			{
				count++;
			break;
			}
			
		}
		if(count==0)
			System.out.print(i+" , ");

		
	 }
  }

}
