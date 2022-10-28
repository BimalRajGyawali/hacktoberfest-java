//reversing of 32-bit Integer in range [-231, 231 - 1]
package org.example.datastructures.arrays;

public class ReverseInteger
{
  
 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
   
        int result = reverseIntegerNum(number);
        System.out.println(result);
        
    }
  
public int reverseIntegerNum(int x) {
    
       long revNum=0;
        while(x!=0){
                
                int rem=x%10;
                revNum=revNum*10+rem;
                        x=x/10;
                if(revNum>Integer.MAX_VALUE || revNum<Integer.MIN_VALUE) return 0;
                
                
        }
        return (int)revNum;
    }
}
}
