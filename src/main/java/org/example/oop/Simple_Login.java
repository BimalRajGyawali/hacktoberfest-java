//Simple Login Logic program using Java
/*
Write a program that prints checks username and password
- First asks the user to register a username and password.
- Save these in two String variables.
- Now ask the user to enter the username, check if it matches the original entered
username (ignore case), otherwise ask to enter again
- Ask the user to enter password (make sure to check the case also), otherwise ask to
enter again
- At the end just confirm to the user that they entered the correct username and
password.
*/

import java.util.Scanner;

class Simple_Login {
	String name,pw,uname,upassword;
	boolean flag1=true,flag2=true;
	Scanner scan=new Scanner(System.in);
	void register(){
		System.out.print("Enter new username: ");
		uname=scan.next();
		System.out.print("Enter new userpassword: ");
		upassword=scan.next();
	}
	//checking to match the save data
	boolean checkName(){
		System.out.println();
		System.out.print("Enter the username: ");
		name=scan.next();
		if(name.toLowerCase().equals(uname.toLowerCase())){
			flag1=false;

		}
		return flag1;
	}
	boolean checkPW(){
		System.out.println();
		System.out.print("Enter the userpassword: ");
		pw=scan.next();
		if(pw.equals(upassword)){
			flag2=false;
		}
		return flag2;
	}
	public static void main(String[] args) {
		Simple_Login ln=new Simple_Login();
		ln.register();
		while(ln.checkName()){
			System.out.println("Again enter username");
		}
		while(ln.checkPW()){
			System.out.println("Again enter userpassword");
		}
		System.out.println();
		System.out.println("You entered the correct username and password");
	}
}