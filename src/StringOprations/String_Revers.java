package StringOprations;

public class String_Revers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Aspire";
String a[]=s.split("");
System.out.print("Given String is :-");
for(String s1:a)
{
	System.out.print(s1);
}
System.out.println();
System.out.print("Revers String is :-");
for(int s1=a.length-1;s1>=0;s1--)
{
	System.out.print(a[s1]);
}
	}

}
