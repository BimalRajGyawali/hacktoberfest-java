import java.io.*;
import java.util.*;

class SmallestNumberGreedy
{
    public static void main(String args[])
    {
        
        int sum = 9 ;
        int diff = 2;
        Solution ab = new Solution();
      String s =  ab.smallestNumber(sum, diff);
      System.out.print(s);
    }
}



//Function for smallest number
class Solution{
    static String smallestNumber(int S, int D){
        // code here
    StringBuilder s = new StringBuilder();
   
 
 s.append('$');
      for(int i = 0 ; i<D ; i++){
          if(S>9){
              s.insert(0,9);
              S -= 9;
          }
          else if(i == D-1){
           s.insert(0,S);
           S = 0;
          }
          else if(S == 1){
             s.insert(0,0); 
             
          }
          else{
              s.insert(0,S-1); 
              S = 1;
          }
      }
       
        return (S>0)?"-1":s.substring(0,s.length()-1);
        
    }
}
