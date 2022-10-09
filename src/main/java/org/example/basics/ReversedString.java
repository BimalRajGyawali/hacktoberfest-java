package org.example.basics;

public class ReversedString {
	
	public static void main(String[] args) {
		
		String myname = "Ghost";
		String reversedStr = "";
		
		for (int i = myname.length()-1;i>=0;i--) {
			
			reversedStr = reversedStr+myname.charAt(i);
		}
		System.out.println("Original "+myname);
		System.out.println("Reversed "+reversedStr);
	}
	
	
	
	
}