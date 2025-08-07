import java.util.Arrays;
public class SegregateNP{
	public static void main (String [] args){
			int a[]={1,2,-5,7,-20,-5,-7,6,34,35,71};
			int b[]= new int[a.length];
			int j=0;
			
			for(int i=0; i<b.length; i++){
				if(a[i]>=0)
				b[j++]=a[i];
			}
			
			for(int i=0; i<b.length; i++){
				if(a[i]<0)
				b[j++]=a[i];
			}
		System.out.println(Arrays.toString(b));
		}
}
