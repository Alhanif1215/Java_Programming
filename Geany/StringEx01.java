import java.util.Arrays;
class StringEx01
 {
	 public static void main (String [] args){
	 String str = "Java is a Beautiful Programing Language";
	 
	 //Length Method
	 System.out.println("Length is: " + str.length());
	 
	 //String in Array element
	 char[]a = str.toCharArray();
	 System.out.println(Arrays.toString(a));
 }
 }
