import java.util.*;
class EvenReverse
{
	public static void main (String[]args)
	{
		String str="Java is the most beautiful programing language in world";
		String a[]=str.split(" ");
		
		for(int i=0; i<a.length; i++)
		{
			String rev="";
			for(int j=0; j<a[i].length(); j++)
			{
				if (i%2==1){
				rev=a[i].charAt(j)+rev;
			   }
			   else
			   rev=a[i];

		   }
			a[i]=rev;
		}
		
		System.out.println("Reverse words in the sentence is: ");
		for(int i=0; i<a.length; i++)
		{
			
		System.out.print(a[i]+" ");
	    }
	}
}

