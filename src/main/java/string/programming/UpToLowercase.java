package string.programming;

public class UpToLowercase {
	public static void main(String[] args) {
		String str="HoW ARE Y0u b2I&Y";
		String lower="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				lower +=(char)(ch+32);
			}
			else
				lower += ch;
		}
		System.out.println(lower);
	}

}
