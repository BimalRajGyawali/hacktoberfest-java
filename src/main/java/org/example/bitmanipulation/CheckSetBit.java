package org.example.bitmanipulation;
class CheckSetBit {
    public static void main(String args[])
    {
      int n = 4;
      int k = 2;
      n = n>>k;
      int newNum = n&1;
      if(newNum==0)
      {
        System.out.println(k +" bit is not a Setbit");
      }
      else{
        System.out.println(k + " bit is a Setbit");//will execute
      }
    }
}
        
