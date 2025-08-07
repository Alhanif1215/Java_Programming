import java.util.ArrayList;
public class CollectionArray {
	
	public static void main (String[] args) {
		ArrayList a=new ArrayList();
		System.out.println(a.size());
		a.add(10);
		a.add(20);
		a.add("30");
		a.add('9');
		a.add(null);
		a.add("");
		a.add(" ");
		a.add(true);
		
		System.out.println(a.size());
		System.out.println(a);
	}
}

