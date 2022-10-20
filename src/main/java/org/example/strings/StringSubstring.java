package org.example.strings;

public class StringSubstring {
	public static void main(String args[])
	{

		// Initializing String
		String str = new String("Hello World.This is a Substring");

		// using substring() to extract substring
		// returns ()geeksforgeeks
	
		System.out.println("The extracted substring is : ");
		System.out.println(str.substring(12));
	}
}
