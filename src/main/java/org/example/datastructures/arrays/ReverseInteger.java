//reversing of 32-bit Integer in range [-231, 231 - 1]

public class solutionJava 
{
  
 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
   
        int result = reverseInteger(number);
        System.out.println(result);
        
    }
  
public int reverseInteger(int x) {
    
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
