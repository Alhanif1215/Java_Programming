public class SameArray {
	
	public static void main (String[] args) {
		int a[]={1,2,3,4,5,6,8,0};
		int b[]={1,2,3,4,5,6,7,0};
		int count=0;
		if(a.length==b.length){
		   for(int i=0; i<a.length; i++){
			   if(a[i]==b[i]){
				   count++;
				   }
			   }
		
	    }
	    else {
			System.out.println("Both array are not same");
		}
		
		if(count==a.length){
		System.out.println("Both Arrays are same");
	    }
	    else {
			System.out.println("Both array are not same: "+count);
		}
	}
}

