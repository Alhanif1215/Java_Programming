public class Pattern {
	
	public static void main (String[] args) {
		int str=1;
		int spc=4;
		for(int r=1; r<=4; r++){
			for(int c=1; c<=spc; c++){
				System.out.print("  ");
			}
			int a=1;
			for(int c=1; c<=str; c++){
				System.out.print(a++ +" ");
				
			}	
		System.out.println();			
				str +=2;
				spc--;
			
			}
		
	}
}

