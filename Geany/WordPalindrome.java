import java.util.*;
class WordPalindrome
{
	public static void main (String[]args)
	{
		    String str="Mom";
			String rev="";
			for(int j=0; j<str.length(); j++)
			{
				rev=str.charAt(j)+rev;
		   }
		   if(rev.equalsIgnoreCase(str))System.out.println("The entered word is palindrome: "+str);
	  
	   else System.out.println(str+", this word is not a palindrome");
	}
}


