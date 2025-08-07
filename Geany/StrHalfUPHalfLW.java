class StrHalfUPHalfLW{
	public static void main (String [] arga){
		String s="aBcDefGHI";
		String r="";
		for(int i=0; i<s.length(); i++){
			char ch=s.charAt(i);
			if(i<=s.length()/2){
				if(ch>='a' && ch<='z')		
						r +=(char)(ch-32);
				else r +=ch;	
			}
			else{
				if(ch>='A' && ch<='Z')
						r +=(char)(ch+32);
				else r +=ch;	
		}
	}
		System.out.println(r);	
	}
}
