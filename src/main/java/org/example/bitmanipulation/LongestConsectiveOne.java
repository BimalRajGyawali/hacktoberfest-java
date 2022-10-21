package org.example.bitmanipulation;
class LongestConsectiveOne {
  public static void main(String args[])
  {
    int max = 0;
    int count = 0;
    int N = 14;
    while(N!=0)
    {
      int temp = N&1;
      if(temp == 1)
      {
        count+=1;
        if(count>max)
        {
          max = count;
        }
      }
      else
      {
        count =0;
      }
      N = N>>1;
    }
    System.out.println(count);//will print 3 as Binary representation of 14 is 1110
  }
}
