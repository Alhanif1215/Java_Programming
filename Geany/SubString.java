import java.util.*;

class SubString {
	public static boolean isString(String str, String subStr){
		
		  for(int i=0; i<str.length(); i++){
			  for(int j=i+1; j<=str.length(); j++){
			    String newStr=str.subStr(i,j);
			     if(newStr.equals(subStr))
			     return true;
			  }
		}
		return false;
	}
	public static void main(String[]args){
		String    str="hello java programing";
		String subStr="program";
		System.out.println(isString(str,subStr));
		}
	}
