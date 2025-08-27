package string.programming;

public class HeLlO_wOrLd {

	public static void main(String[] args) {

		String str = "Java is a beautiful programing language";
		StringBuilder res = new StringBuilder();
		char a[] = str.toCharArray();
		
		int count = 0; //To track only non space character;
		for (char c : a) 
		{
			if(c == ' ')
			{
				res.append(c);
			}
			else
			{
				if(count == 0) {
					res.append(c); //First letter as it is;
				}
				else {
					if(count % 2 == 1)
					{
						res.append(Character.toLowerCase(c));
					}
					else
					{
						res.append(Character.toUpperCase(c));
					}
				}
				count++;
			}

			
		}
		System.out.println(res);
	}
}
