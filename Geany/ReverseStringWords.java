public class ReverseStringWords {
	
	public static void main (String[] args) {
		String a="java is a beautiful programing language";
		String b[]=a.split(" ");
		String c[]=new String[b.length];
		for(int i=b.length-1,j=0; i>=0; i--,j++){
			c[j]=b[i];
			}
			for(int i=0; i<c.length; i++){
			System.out.print(c[i] +" ");
		}
	}
}

