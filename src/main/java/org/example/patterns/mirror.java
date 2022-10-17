import java.util.Scanner;
public class mario 
{
    public static void main (String args[]) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter height");
        int height=0,i,j,k,l;
        height = sc.nextInt();
        for(i=height-1; i>=0; i--) 
        {
            for(j=0; j<=i-1; j++) 
            {
                System.out.print(" ");
            }
            for(k=height-j-1; k>=0; k--)
            {
                System.out.print("#");
            }
            System.out.print(" ");
            for(l = height-1 ; l>=i; l--)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
/*-------- OUTPUT -----------
Enter height
6
     #  # 
    ##  ## 
   ###  ### 
  ####  #### 
 #####  ##### 
######  ###### 
------------------------------
*/
