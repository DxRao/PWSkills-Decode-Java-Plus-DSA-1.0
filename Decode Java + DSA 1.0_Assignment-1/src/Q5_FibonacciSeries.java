import java.util.Scanner;

public class Q5_FibonacciSeries {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1, n3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for which first 'n' terms of Fibonacci Series is needed: ");
		int inputNumber = sc.nextInt();		
		
		for(int i = 1; i <= inputNumber; i++) {			
			
			System.out.print(" " + n1);	
			
			n3 = n1 + n2;				
			n1 = n2;
			n2 = n3;			
		}
	}
}
