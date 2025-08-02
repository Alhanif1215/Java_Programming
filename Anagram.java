import java.util.Arrays;
public class Anagram {
	
	public static void main (String[] args) {
		String s1="silent";
		String s2="listeN";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length()){
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			/*
			String t1=new String(ch1);
			String t2=new String(ch2);
			System.out.println(t1.equals(t2)?"Anagram":"Not a Anagram");
			*/
			
			boolean flg = false;
			for(int i=0; i<ch1.length; i++){
				if(ch1[i]==ch2[i])
				flg=true;
				else{
					flg=false;
					break;
					}
				}
				System.out.println(flg==true?"Anagram":"Not a Anagram");
			}else System.out.println("Not a Anagram");
		
	}
}

