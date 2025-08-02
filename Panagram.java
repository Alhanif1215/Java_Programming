import java.util.Arrays;
public class Panagram {
	
	public static void main (String[] args) {
		String s="the quick brown fox jumps over a lazy dog";
		s=s.toLowerCase();
		int c=0;
		for(char ch='a'; ch<='z'; ch++){
			if(s.indexOf(ch)>=0){
			c++;
		}
			}
			System.out.println(c==26?"Panagram":"Not a Panagram");
	}
}

