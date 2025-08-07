import java.util.*;
class ReverseWord
{
	public static void main (String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String str=s.nextLine();
		String a[]=str.split(" ");
		
		for(int i=0; i<a.length; i++)
		{
			String rev="";
			for(int j=0; j<a[i].length(); j++)
			{
				rev=a[i].charAt(j)+rev;
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
