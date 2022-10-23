package org.example.bitmanipulation;
import java.util.*;
public class GetElementAppearingOnce
{
	public static void main(String[] args) 
  {
		int n =4;
		int[] arr = new int[]{1, 10, 1, 1};
		Arrays.sort(arr);
		for(int i =0;i<n;)
    {
      if(i == n-1 )
      {
        System.out.println(arr[i]);
        break;
      }
      else if(arr[i]!=arr[i+1] )
      {
        System.out.println(arr[i]);
        break;
      }
      else
      {
        i = i+3;
      }
    }
  }
}
  
