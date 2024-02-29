import java.util.*;

public class Q4_CheckForPalindrome {

	public static void main(String[] args) {
		
		String inputString = "";
		String reverseString = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String to check whether it's a Palindrome or Not: ");
		inputString = sc.nextLine();	
		
		for(int i = inputString.length() - 1; i >= 0; i-- ) {

			reverseString = reverseString + inputString.charAt(i);
			
		}		
		
		if(inputString.equals(reverseString)) {
			
			System.out.println("Inputted String is a Palindrome.");			
		}
		else {
			
			System.out.println("Inputted String is NOT a Palindrome.");
			
		}	

	}

}
