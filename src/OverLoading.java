
public class OverLoading {

	
	void substraction()
	{
		System.out.println("Here we Perform Substraction Opration");
	}
	void substraction(int a,int b)
	{
		int c=a-b;
		System.out.println("Substraction of "+a+" & "+b+" is :->"+c);
		
		
	}
	void substraction(int a)
	{
		int c=a-10;
		System.out.println("Substraction of "+a+" & "+10+" is :->"+c);
	}
	void substraction(int a,int b,int c)
	{
		int d=(a-b)-c;
		System.out.println("Substraction of "+a+" "+b+" & "+c+" is :->"+d);
		
	}
//	void substraction()
//	{
//		
//	}
//	void substraction()
//	{
//		
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoading O=new OverLoading();
		O.substraction();
		O.substraction(30);
		O.substraction(80, 30);
		O.substraction(80,10,10);
			}

}
