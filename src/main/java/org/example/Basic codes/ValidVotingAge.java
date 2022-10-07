/*
    Write a program which takes age from user as input and determines whether 
    user is valid for voting or not.
*/


class ValidVotingAge
{
 
    public static void main(String args[ ])
    {
       int age;
       age=Integer.parseInt(args[0]);
 
       if(age>=18)
          System.out.println("Your age is valid for voting");
       else
         System.out.println("Your age is not valid for voting");
    }

}

/* ============ OUTPUT ==============

C:\Java\bin>javac ValidVotingAge.java

C:\Java\bin>java ValidVotingAge 18
Your age is valid for voting

C:\Java\bin>java ValidVotingAge 15
Your age is not valid for voting

================================== */
        