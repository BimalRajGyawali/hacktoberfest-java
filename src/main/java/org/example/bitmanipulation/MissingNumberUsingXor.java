package org.example.bitmanipulation;
class MissingNumberUsingXor{
  public static void main(String args[]) {
    int[] arr = new int[] {1,2,3,5,6};
    int n = 5;
    int xor1 =0;
    int xor2 =0;
    for(int i=1;i<=n;i++)
    {
      xor1 ^= i;
    }
    for(int i=0;i<arr.length;i++)
    {
      xor2 ^= arr[i];
    }
    int ans = xor1^xor2;
    System.out.println(ans);//will print 4
  }
}
  
