
public class SsnDemo {
	public static void main(String[] args) {
		int a1 = 9;
		int a2 = 1;
		int a3 = 1;
		int a4 = 1;
		int a5 = 1;
		int a6 = 1;
		
		int b1 = 1;
		int b2 = 0;
		int b3 = 6;
		int b4 = 6;
		int b5 = 0;
		int b6 = 1;
		int b7 = 2;
		
		//1. each digit number multiple by 2 to 9, again, multiple by 2 to 5. Then, get a sum of the numbers.
		
		int sum = a1 * 2 + a2 * 3 + a3 * 4 + a4 * 5 + a5 * 6 + a6 * 7 + b1 * 8 + b2 * 9 + b3 * 2 + b4 * 3 + b5 *4 + b6  * 5;
		
		//2. Divide the total number by 11, then get the remainder.
		int remainder = sum%11; 
				
		//3. From 11, minus the remainder.
		remainder = 11 - remainder;
		
		//4. Divide the #3 result by 10, and get the remainder.
		remainder = remainder % 10;
		
		//5. If the result of the #4 and the last number of SSN are same, it is a valid SSN.
		if (b7 == remainder) {
			System.out.println("Valid SSN");
		}else {
			System.out.println("Invalid SSN");
		}
	}

}
