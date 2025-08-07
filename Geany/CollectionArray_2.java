import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
public class CollectionArray_2 {
	
	public static void main (String[] args) {
		ArrayList a=new ArrayList();
		System.out.println("Before adding element in a: "+a.size());
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		try {
		ListIterator i=  a.listIterator();
		System.out.println(i.hasPrevious());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.hasPrevious());		
		System.out.println(i.next());
		
	} catch(Exception e) {
		System.out.println("There is no 5th Element or index(4)");
		
	} finally {
		System.out.println("\n************************************************************");
		Iterator o= a.iterator();
		while(o.hasNext()){
		System.out.println(o.next());			
			}
	}
}
}
