public class RemoveDuplicate {
	
	public static void main (String[] args) {
		String s="ajdskdshjdafdjcjfdsvkcnskdjhvbf";
		String rev=" ";
		
		for(int i=0; i<s.length(); i++){
			char ch=s.charAt(i);
			boolean f=false;
			
			for(int j=0; j<rev.length(); j++){
					if(rev.charAt(j)==ch){
						f=true;
						break;
					}
			}
			if(!f){
				rev +=ch; }
			
    	}
			System.out.println(rev);
	}
}

