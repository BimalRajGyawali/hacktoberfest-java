package org.example.exceptions;

/*
*  In this code, I have defined a custom exception UserAlreadyExists, which can be used
*  in systems where unique email addresses are required for registration purpose.
 */


// Constructor of UserAlreadyExists takes a string as an argument.
// This string is passed to constructor of parent class Exception using the super() method.

class UserAlreadyExists extends Exception{

    public UserAlreadyExists(String excep){
        super(excep);
    }
}

public class CustomExceptionTest {

    // registeredUsers array simulates to database where email addresses of registedred users are stored
    public static String[] registeredUsers={
            "jason@gmail.com",
            "david99@gmail.com",
            "aaron456@gmail.com",
            "cameron18@gmail.com"
    };

    // registerUser() method checks if newEmailAddress already exists, if yes then it throws UserAlreadyExists exception
    // else registration process is considered successful.
    static void registerUser(String newEmailAddress) throws UserAlreadyExists{
        boolean isValid=true;
        for(String emailId:registeredUsers){
            if(emailId.equals(newEmailAddress)){
                isValid=!isValid;
                throw new UserAlreadyExists("The email address is already registered!!");
            }
        }
        if(isValid){
            System.out.println("Registration Successful :)");
        }

    }
    
    public static void main(String[] args) {
        try{
            registerUser("marshmitchell@gmail.com");
            registerUser("aaron456@gmail.com");
        }
        catch (UserAlreadyExists exp){
            System.out.println("Exception Occurred:");
            System.out.println(exp);
        }
    }
}


/* ========================== TEST CASES ==========================
*
*     Test Case 1:
*        registerUser("marshmitchell@gmail.com");
*     Output:
*        Registration Successful :)
*
*     Test Case 2:
*        registerUser("aaron456@gmail.com");
*     Output:
*        Exception Occurred:
*        org.example.exceptions.UserAlreadyExists: The email address is already registered!!
*
* ===================================================================== */


