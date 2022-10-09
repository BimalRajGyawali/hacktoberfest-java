package org.example.basics;

public class Palindrome {

	/*Method to
	Returning true if string is palindrome*/
	static boolean isPalindrome(String str)
	{

		//Here pointers point to the begining and end of the String
		int i = 0, j = str.length() - 1;

		//do comapre while 
		while (i < j) {

			//if find a mismatch letter
			if (str.charAt(i) != str.charAt(j))
				return false;
			
			// Increment first pointer and decrement other pointer
			
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

	// Method 2
	// main driver method
	public static void main(String[] args)
	{
		// Input string
		String str = "lol";

		//Convert the string to lowercase
		str = str.toLowerCase();
		// passing bool function till holding true
		if (isPalindrome(str))

			// It is a palindrome
			System.out.print("Yes");
		else

			// Not a palindrome
			System.out.print("No");
	}
}