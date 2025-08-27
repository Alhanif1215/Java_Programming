package number.programming;

public class NumberSwaping {
	
	public static void main(String[] args) {
		double firstNumber = 15.30;
		double secondNumber = 21.90;
		
		System.out.println("Before Swaping");
		System.out.println("First Number: "+firstNumber);
		System.out.println("Second Number: "+secondNumber);
		
		//XOR //Works Only with integer 
//		firstNumber = firstNumber ^ secondNumber;
//		secondNumber = firstNumber ^ secondNumber;
//		firstNumber = firstNumber ^ secondNumber;
		
		//Add Subtract
//		firstNumber = firstNumber + secondNumber;
//		secondNumber = firstNumber - secondNumber;
//		firstNumber = firstNumber - secondNumber;
		
		//Multiply Divide
		firstNumber = firstNumber * secondNumber;
		secondNumber = firstNumber / secondNumber;
		firstNumber = firstNumber / secondNumber;		
		
		
		System.out.println("\u001B[32mAfter Swaping");
		System.out.println("First Number: "+firstNumber);
		System.out.println("Second Number: "+secondNumber);
	}

}
