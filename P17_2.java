import java.util.*;

class P17_2{
	public static void main(String[]arg){
		String str="Hello javaaaaavvv";
		char a[]=str.toCharArray();
		String newStr="";
		Arrays.sort(a);
		for(int i=0; i<a.length-1; i++){
			if(a[i]!=a[i+1])
			 newStr=newStr+a[i];
			}
			newStr=newStr+a[a.length-1];
		System.out.println(newStr);	
}
}
