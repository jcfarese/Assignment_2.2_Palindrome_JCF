/**
 * the application that uses the Palindrome class to take a user input as a string and tests if the word is a palindrome or not
 * @author Jim Farese
 * @version 9/28/22
 * 
 * Fall 2022
 */

import java.util.Scanner;


public class Application {
	
	//Main method that implements all the methods from the Palindrome class and returns whether the string a user inputs is a stack or not
	public static void main(String[] args) {		
		
		//used to allow for a user input
		Scanner scan=new Scanner(System.in);
		
		//takes the string and stores it in myString
		System.out.println("Enter a word to test if it is a palindrome:");
		String myString = scan.nextLine();
		
		System.out.println("***Testing if the word is a palindrome***");
		
		//creates an object of type palindrome and implements the isPalindrome method from the palindrome class to test if the string input by the user is a palindrome or not
		Palindrome myStack = new Palindrome();
		myStack.isPalindrome(myString);
		
	}//end main
	
}//end Application class

