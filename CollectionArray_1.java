import java.util.ArrayList;
public class CollectionArray_1 {
	
	public static void main (String[] args) {
		ArrayList a=new ArrayList();
		System.out.println("Before adding element in a: "+a.size());
		a.add(10);
		a.add(20);
		a.add("SQL");
		a.add("API");
		
		ArrayList b=new ArrayList();
		System.out.println("Selenium added: "+b.add("Selenium"));
		b.add("Manual Testing");
		b.add(0, "Automation Testing");
		
		System.out.println("Element of Array a: "+a+"\n");
		System.out.println("Element of Array b: "+b);
		System.out.println("-----------------------------------------------------------");
		a.addAll(0,b);
		System.out.println("After merging b to a in 1st place: "+a);
		System.out.println("-----------------------------------------------------------");
		System.out.println("After adding element in a size = "+a.size());
		System.out.println("************************************************************");
		
		System.out.println("a.SQL: "+a.contains("SQL"));
		System.out.println("a.sql: "+a.contains("sql"));
		System.out.println("b.API: "+b.contains("API"));
		System.out.println("a.index of API: "+a.indexOf("API"));
		System.out.println("a.contaoinsAll of b: "+a.containsAll(b));
		System.out.println("b.contaoinsAll of a: "+b.containsAll(a));
		System.out.println("b.contaoinsAll of b: "+b.containsAll(b));
		System.out.println("************************************************************");
		a.remove("Selenium");
		System.out.println("After removing selenium from a size = "+a.size()+"\n a = "+a);
		b.clear();
		System.out.println("b.clear()= "+b);
		System.out.println("\n************************************************************\n");
		System.out.println("a.get indexof 3: "+a.get(3));
		
		
		 
	}
}

