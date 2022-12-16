import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer , String> has=new <Integer , String> HashMap();
		has.put(1, "Mangesh");
		has.put(2, "Mukund");
		has.put(3, "Wandre");
		has.put(1, "Rahul");
	System.out.println(has.containsKey(3));
	System.out.println(has.containsValue("wandre"));


		System.out.println(has);
		has.replace(1, "Mangesh");
		System.out.println(has);
		has.remove(1);
		has.put(1, "Mangesh");
		has.put(4,"Pranit");
		System.out.println();
		for (int i = 1; i <= has.size(); i++) {
		System.out.print(i+")"+has.get(i)+",");
		}	
		
		System.out.println();
			for(Integer temp:has.keySet())
				System.out.print(temp+",");
			System.out.println();
			for(String temp:has.values())
				System.out.print(temp+" ");
			System.out.println();
			for (java.util.Map.Entry<Integer, String> entry : has.entrySet()) {
				Integer key = entry.getKey();
				String val = entry.getValue();
				
				System.out.println(key+"   "+val);
				
				
			}
			
		
		
		for(java.util.Map.Entry<Integer, String> es:has.entrySet())	
		{
			System.out.println(es+",");
		}
		}
		
	}

