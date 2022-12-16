import java.util.ArrayList;
import java.util.Iterator;

public class List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar=new ArrayList();
ar.add("Mangesh");
ar.add("Mukund");
ar.add("Wandre");

//for (int i = 0; i < ar.size(); i++) {
	//ar.get(i);
	
//}

System.out.println();
for (Iterator iterator = ar.iterator(); 
		iterator.hasNext();) {
	//Object object = (Object) iterator.next();
	System.out.println(iterator.next());
}
	}

}
