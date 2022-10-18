package org.example.bitmanipulation;
class CountTotalSetBits {
    public static void main(String args[])
    {
        int i = 9;
        int count =0;
        while(i>0)
        {
          count += i&1;
          i= i>>1;
        }
        System.out.println(count);
    }
}
