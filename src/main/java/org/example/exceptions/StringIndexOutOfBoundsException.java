// StringIndexOutOfBoundsException is caught
package org.example.exceptions;

public class StringIndexOutOfBoundsException extends Throwable {

	public static void main(String args[]) {
		try {
			String string = "Welcome to my world "; // length is 20
			char c = string.charAt(24); // accessing 25th element
			System.out.println("Char: "+c);
		} catch (java.lang.StringIndexOutOfBoundsException e) {
			System.out.println("Exception StringIndexOutOfBoundsException is caught!!!");
		}
	}
}
