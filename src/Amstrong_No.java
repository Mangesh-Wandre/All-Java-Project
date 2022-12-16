import java.util.Scanner;

public class Amstrong_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int armNo;
System.out.println("Enter No. for check given is whether it is armstrong or not :-");
Scanner sc=new Scanner(System.in);
armNo=sc.nextInt();
int sum=0,rem=0,orignal;
orignal=armNo;
while(armNo>0)
{

rem=armNo%10; 
//System.out.println(rem);//153    rem=153%10= 1+125+27=153
sum=sum+(rem*rem*rem);
armNo=armNo/10;

}
System.out.print(sum+"  ");
if(sum==orignal)
{
	System.out.println("no is armstrong");
}
else
{
	System.out.println("no is not armstrong");
}

	}

}
