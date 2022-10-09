
public class BinarySearch {
    
    public static int iterative(int array[], int key)
    {
        int low=0;
        int high=array.length-1;
        while (low<high)
        {
            int mid=(low+high)/2;
            if (array[mid]==key)
            {
                return mid;
            }
            else if (array[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }

    public static int recursive(int array[], int key, int low, int high)
    {
        int mid=(low+high)/2;

        if (array[mid]==key)
        {
            return mid;
        }
        else if (array[mid]>key)
        {
            return recursive(array, key, low, mid-1);
        }
        else
        {
            return recursive(array, key, mid+1, high);
        }
        
    }

    public static void main (String[] args)
    {
        int array[]={3, 5, 12, 34, 45, 67, 87, 90};
        int iterative_result=iterative(array, 67);
        int recursive_result=recursive(array, 87, 0, array.length-1);

        if(iterative_result==-1)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element found at index " + iterative_result);
        }


        if(recursive_result==-1)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element found at index " + recursive_result);
        }
    }
}
