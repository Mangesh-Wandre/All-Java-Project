package com.java.Collection.HasSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class HasSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
hs.add("Mangesh");
hs.add(252525);
hs.add(null);
hs.add(null);
hs.add(71.59);
System.out.println(hs);
boolean empty = hs.isEmpty();
System.out.println(empty);
//hs.removeAll(hs);
//System.out.println(hs);
//System.out.println(hs.isEmpty());
for(Object tmp:hs)
{
	System.out.print(tmp+",");
}
Iterator itr=hs.iterator();
System.out.println();
while(itr.hasNext())
{
	System.out.print(itr.next()+" ,");
}
System.out.println();
hs.forEach(System.out::print);
//
System.out.println();
hs.forEach((x)->{
	System.out.print(x+", ");
});
hs.forEach(n->System.out.print(","+n));

}

}

		
	

