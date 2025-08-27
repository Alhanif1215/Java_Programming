package string.programming;

public class String_Buffer_Builder {

	public static void main(String[] args) {
		String s = "Hello";
		s.concat(" World");
		System.out.println(s);
		
		//String Buffer  //Synchronization
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
		
		//String Builder  // No Synchronization
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		System.out.println(builder);
		
		s.length();
		s.toCharArray();
		System.out.println(s.concat("! Hanif"));
		System.out.println(s.contains("llo"));
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf("lo"));
	}
}
