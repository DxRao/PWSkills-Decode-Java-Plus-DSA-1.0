import java.util.*;

public class Q1_SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		int sum = 0;		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive number for which Sum of its Natural numbers is needed: ");
		int inputNumber = sc.nextInt();		
		
		for(int i = 1; i <= inputNumber; i++) {
			
			sum = sum + i;
			
		}
		
		System.out.println("Sum of first " + inputNumber +" Natural numbers = " + sum);
	}
}
