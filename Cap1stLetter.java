public class Cap1stLetter {
	public static void main (String[] args) {
		String s="  a big elephent is under the tree ";
		String res="";
		for(int i=0; i<s.length(); i++){
			char ch=s.charAt(i);
		   if(i==0 && ch!=' '|| ch!=' '&& s.charAt(i-1)==' '){
			  if(ch>='a' && ch<='z'){
			    res +=(char)(ch-32);
			  } else  res += ch;
		   } else res += ch;	
		} System.out.println(res);
	}
}

