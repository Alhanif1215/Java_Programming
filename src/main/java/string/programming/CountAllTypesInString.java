package string.programming;

public class CountAllTypesInString {
	public static void main(String[] args) {
		String str="How Are Y0U? Digits are 93667,98765";
		int up = 0,lw = 0,sp = 0,ws = 0,nm = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				up++;
			}
			else if(ch>='a' && ch<='z') {
				lw++;
			}
			else if(ch == ' ') {
				ws++;
			}
			else if(ch>='0' && ch<='9') {
				nm++;
			}
			else
				sp++;
		}
		System.out.println("UpperCase: "+up+" \nLowerCase: "+lw+" \nDigits: "+nm+" \nSpecialCharacter: "+sp+" \nWhiteSpace: "+ws);
	}
}
