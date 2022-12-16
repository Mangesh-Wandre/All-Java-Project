import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("Deepa");
		v.add("Ankita");
		v.add("Mangesh");
		
		
		v.add(10.1f);
		v.add(20);
		v.add('c');
	
		v.add(null);
		v.add(null);
		System.out.println(v);
		
		Iterator itr= v.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
		System.out.println();
		 ListIterator listitr= v.listIterator(v.size());
		 
		 while(listitr.hasPrevious())
		 {
			 System.out.print(listitr.previous()+",");
		 }
	System.out.println();
		 Enumeration e=v.elements();
		 while(e.hasMoreElements())
		 {
			 System.out.print(e.nextElement()+",");
		 }

	}

}
