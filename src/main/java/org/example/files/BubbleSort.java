class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int x = 0; x < n-1; x++)
            for (int y = 0; y < n-x-1; y++)
                if (arr[y] > arr[y+1])
                {
                    // swap arr[y+1] and arr[y]
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
    }
 
    /* Prints Array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int x=0; x<n; ++x)
            System.out.print(arr[x] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        BubbleSort bs = new BubbleSort();
        int arr[] = {57, 11, 5, 19, 20, 42, 33};
        bs.bubbleSort(arr);
        System.out.println("Sorted Array");
        bs.printArray(arr);
    }
}