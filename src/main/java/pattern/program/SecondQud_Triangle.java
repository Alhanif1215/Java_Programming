package pattern.program;

public class SecondQud_Triangle {
	public static void main(String[] args) throws Exception {
		int spc = 4;
		int str = 1;
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= spc; c++) {
				System.out.print("  ");
			}
			for (int c = 1; c <= str ; c++) {
				System.out.print("* ");
			}
			System.out.println();
			spc--;
			str++;
		}
		System.out.println("\n");
		// Using only two for loop
		int n=5;
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if(r+c >=n+1 && r+c <=2*n ) {
					System.out.print("* ");
				}
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
