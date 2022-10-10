package org.example.algorithms.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
       System.out.println(Arrays.toString(cyclicSort(new int[]{0,1,2,3,4,7,6})));
    }

    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if(arr[i]!= i){
                int temp = arr[i];
                arr[i] = arr[arr[i]];
                arr[temp] = temp;
            }
            else{
                i++;
            }

        }
return arr;
    }
}
