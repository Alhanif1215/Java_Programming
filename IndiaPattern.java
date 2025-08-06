public class IndiaPattern {
	
	public static void main (String[] args) throws Exception{
		int n=9;
		int res=0;
		for(int r=1; r<=n; r++){
			for(int c=1; c<=n; c++){
				if(r==1 || r==n || c==n/2+1){
					System.out.print("* ");
					Thread.sleep(90);
				}
					else 
					System.out.print("  ");
			}
			System.out.print("   ");
			for(int c=1; c<=n; c++){
				if(r==c || c==1 || c==n){
					System.out.print("* ");
					Thread.sleep(90);
				}
					else 
					System.out.print("  ");
			}
			System.out.print("   ");		
			for(int c=1; c<=n; c++){
				if(r==1 && c<=n-1 || c==1 ||r==n && c<=n-1 || c==n && r>=2 && r<=n-1){
					System.out.print("* ");
					Thread.sleep(90);
				}
					else 
					System.out.print("  ");
			}
			System.out.print("   ");	
			for(int c=1; c<=n; c++){
				if(r==1 || r==n || c==n/2+1){
					System.out.print("* ");
					Thread.sleep(90);
				}
					else 
					System.out.print("  ");
			}
			System.out.print("   ");
			for(int c=1; c<=n; c++){
				if(n>=3 && n%2==1)
				res=n-((n-5)/2+1);
				if(r+c==res || r==n/2+1 || c-r==n/2 || c==1 && r>=n/2+1 || c==n && r>=n/2+1){
					System.out.print("* ");
					Thread.sleep(90);
				}
					else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

