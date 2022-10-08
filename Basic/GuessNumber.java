import java.util.*;
public class GuessNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);
        int usernumber=0;
    do   
    {
        System.out.println("Guess my number (1-100):");
        usernumber=sc.nextInt();
        if(usernumber==myNumber)
        {
        System.out.println("WOOHOO..Correct Number");
        break;
        }
        else if(usernumber>myNumber)
        {
        System.out.println("Your number is too large");
        }
        else
        {
        System.out.println("Your number is too small");
        }
        }
    while(usernumber>=0);
    System.out.println("My number was "+myNumber);
    }
}
