
// Java program for recursive implementation
// of Bubble sort
//contributed by @whyanujjwhy
  
import java.util.*;
  
public class RecursiveBubbleSort
{
    //bubble sort function for recursive calling
    static void bubbleSort(int arr[], int n)
    {
        if(n == 1)
            return;
  
        int count = 0;
        for(int i=0; i<n-1; i++)
            if(arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count = count+1;
            }
  
        //if already sorted array
        if (count == 0)
           return;
  
        //heaviest element at last
        // recursion for remaining array
        bubbleSort(arr, n-1);
    }
      
    public static void main(String[] args)
    {
        //System.out.println("Enter size: ");

        int arr[] = {50,80,20,10,30,90,40,70,60};
       
        bubbleSort(arr, arr.length);
          
        System.out.print("Sorted array: ");
        System.out.print(Arrays.toString(arr));
    }
}
