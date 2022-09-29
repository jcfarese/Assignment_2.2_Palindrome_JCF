/**
 * Palindrome takes a string and pushes it into a stack one character at a time to test if the word is a palindrome or not
 * @author Jim Farese
 * @version 9/28/22
 * 
 * Fall 2022
 */

import java.util.Stack;

public class Palindrome {

	private String string;
	private Stack<Character> stack1;
	private Stack<Character> stack2;
	
	
	//Constructors initialization
	public Palindrome() {
		
		stack1 = new Stack<Character>();
		stack2 = new Stack<Character>();
		
	}//end Palindrome
	
	/**
	 * Takes a string from the user and brakes it into individual characters and pushes it into the stack
	 * @param string is the string that the user inputs
	 * @return stringToStack which is a stack with each element being a character from the original string
	 */
	private Stack<Character> toStack(String string){
		
		Stack<Character> stringToStack = new Stack<Character>();
		
		for(int i=0; i<string.length(); i++) {
			
			char temp = string.charAt(i);
			if(acceptedChars(temp)) {
				stringToStack.push(temp);
				
			}
			
		}
		return stringToStack;	
	}//end stringToStack
	
	/**
	 * Takes each individual character from the original string and checks it against an array of characters that are not accepted and adds them to the stack if they are accepted
	 * @param character is the character that is tested against the array
	 * @return true if the character being tested is not in the notAllowed array and false if the character is in the array
	 */
	private Boolean acceptedChars(char character) {
		
		Boolean accepted = true;
		
		char[] notAllowed = {'!','@','#','$','%','^','&','*','(',')','-','_','=','+','`','~',';',':',',','<','.','>','/','?','[',']','{','}','|',' '};
		
		for(char n:notAllowed) {
			if(character == n) {
				accepted=false;
			}
		}
		return accepted;
	}//end acceptedChars

	/**
	 * Takes a string and reverses it and pushes the elements on the stack backwards
	 * @param string is the string that the user inputs 
	 * @return a stack with each element being a character from the string backwards
	 */
	private Stack<Character> reverseStack(String string){
		
		Stack<Character> tempStack = toStack(string);
		Stack<Character> reverseStack = new Stack<Character>();
		
		for(int i=0;i<string.length();i++) {
			char temp = tempStack.pop();
			reverseStack.push(temp);
		}
		return reverseStack;
	}//end reverse stack
	
	/**
	 * takes a string and uses the toStack method to push it to a stack and uses the reverseStack method to push it to a stack backwards and then compares the two stacks forward and backwards to test if the word is a palindrome
	 * @param string from the user input
	 */
	public void isPalindrome(String string) {
		
		Boolean compare = true;
		
		Stack<Character> toStack=toStack(string);
		System.out.println("The original word you entered is " + toStack.toString());
		
		Stack<Character> reverseStack=reverseStack(string);
		System.out.println("The reverse of the word you entered is " + reverseStack.toString());
		
		while(!toStack.isEmpty()&&compare==true) {
			if(toStack.pop()!=reverseStack.pop()) {
				compare=false;
			}
		}
		
		if(compare==true) {
			System.out.println("The word is a palindrome!");
		}
		else {
			System.out.println("The word is not a palindrome");
		}
		
	}//end isPalindrome

}//end Palindrome Class	