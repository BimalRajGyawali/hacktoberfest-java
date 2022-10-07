/*  
     Write a program to print all the upper case and lower case letters.
*/


class PrintAlphabets
{
 
    public static void main(String[ ] args)
    {
        char i;
 
        for(i=65;i<=90;i++)        // Loop to print upper case letters
        {
           System.out.print(i+" ");
        }
        
        System.out.println();

        for(i=97;i<=122;i++)     // Loop to print lower case letters
        {
            System.out.print(i+" ");
         }
    }
}


/* ================ OUTPUT ===============

C:\Java\bin>javac PrintAlphabets.java

C:\Java\bin>java PrintAlphabets
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
a b c d e f g h i j k l m n o p q r s t u v w x y z

======================================= */