package org.example.algorithms.searching;

public class FibonacciSearch {

    public static void main(String[] args) {
        int[] array = {3, 5, 12, 34, 45, 67, 87, 90};
        int search_result = search(array, 67);

        if (search_result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + search_result);
        }
    }

    private static int search(int[] array, int x) {

        int n = array.length;
        /* Initialize (m-2)th , (m-1)th and mth fibonacci numbers */
        int fibMMm2 = 0;
        int fibMMm1 = 1;
        int fibM = fibMMm2 + fibMMm1;

        /* fibM is going to store the smallest fibonacci number greater than or equal to n */
        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }

        // Marks the eliminated range from front
        int offset = -1;

        /* while we search the elements in array.Note that comparisons of array[fibMm2] are made with x.
        When fibM becomes 1, fibMm2 becomes 0 */
        while (fibM > 1) {
            // Check if fibMm2 is a valid location
            int i = Math.min(offset + fibMMm2, n - 1);

            /* If x is greater than the value at index fibMm2, split the sub-array array
            from offset to i */
            if (array[i] < x) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            }

            /* If x is less than the value at index fibMm2, cut the sub-array after i+1 */
            else if (array[i] > x) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            }

            /* element found. return index */
            else
                return i;
        }

        /* comparing the last element with x */
        if (fibMMm1 == 1 && array[n - 1] == x)
            return n - 1;

        /*element not found. return -1 */
        return -1;
    }
}

/* Time complexity = O(log n) */