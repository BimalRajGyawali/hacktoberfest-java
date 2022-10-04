package org.example.collections;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		// Create a stack object  
		Stack <Integer> stk = new Stack<>();  
		
		print(stk);
		
		// Push elements into the stack  
		push(stk, 20);  
		push(stk, 13);  
		push(stk, 89);  
		
		// Pop elements from the stack  
		pop(stk);  
		pop(stk);
		pop(stk);
	}
	
	// Perform the push operations and show the contents of the stack
	static void push(Stack<Integer> stk, int x) {		
		stk.push(x);	
		
		System.out.println("push -> " + x);		
		  
		print(stk);
	}
	
	// Perform the pop operations and show the contents of the stack  
	static void pop(Stack<Integer> stk) {		
		System.out.println("pop -> " + stk.pop());
		
		print(stk);
	}
	
	// Print the contents of the stack
	static void print(Stack<Integer> stk) {
		System.out.println("Stack: " + stk);  
	}
}