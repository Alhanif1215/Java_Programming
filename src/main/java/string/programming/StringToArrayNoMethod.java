package string.programming;

import java.util.Arrays;

public class StringToArrayNoMethod {

	public static void main(String[] args) {
		String str="java";
		char a[]= new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			a[i]=str.charAt(i);
		}
		System.out.println(Arrays.toString(a));
	}
}
