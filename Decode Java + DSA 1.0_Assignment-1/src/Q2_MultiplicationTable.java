import java.util.Scanner;

public class Q2_MultiplicationTable {

	public static void main(String[] args) {
		
		int value = 0;		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive number for which Multiplication Table is needed: ");
		int inputNumber = sc.nextInt();		
		
		for(int i = 1; i <= 10; i++) {
			
			value = inputNumber * i;
			System.out.println(inputNumber + " * " + i + " = " + value);
			
		}		
	}
}
