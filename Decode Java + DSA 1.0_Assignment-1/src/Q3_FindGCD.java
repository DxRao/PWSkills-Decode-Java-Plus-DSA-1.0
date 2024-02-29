import java.util.Scanner;

public class Q3_FindGCD {

	public static void main(String[] args) {
		
		int GCD = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int firstNumber = sc.nextInt();
		System.out.println("Please enter the second number: ");
		int secondNumber = sc.nextInt();
		
		for(int i = 1; i <= firstNumber && i <= secondNumber; i++) {
			if((firstNumber % i == 0) && (secondNumber % i == 0)) {					
				
				GCD = i;								
			}			
		}
		
		System.out.println("GCD of " + firstNumber + " and " + secondNumber + " is " + GCD);
	}
}
