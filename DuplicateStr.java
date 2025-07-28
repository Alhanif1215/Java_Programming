import java.util.*;

class DuplicateStr{
	public static void main(String[]args){
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		
		char a[]=str.toCharArray();
		boolean ba[] = new boolean [a.length];
	
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j] && ba[i]==false){
					ba[j]=true;
				}
			}
		}
		
		String newStr = "";
		
		for(int j=0; j<a.length; j++){
			if(ba[j]==false)
			newStr += a[j];
							
			}
		System.out.print(newStr);
	}
}
