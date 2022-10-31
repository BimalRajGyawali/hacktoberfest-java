/*
Finds triplet that sums to a given value.
Example:
Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in
the array sums up to 13.
 */
package org.example.basics;

import java.util.Scanner;

public class FindTriplet {
    private static Scanner scanner = new Scanner(System.in);
    private static Integer[] arr;

    public static void main(String[] args) {
        System.out.println("Enter the size of array you want to build");
        Integer size = scanner.nextInt();
        arr = readArrayElement(size);
        System.out.println("enter the value of summation ");
        Integer summation = scanner.nextInt();
        findTripletSum(arr, summation);

    }
    // Displays triplets with given sum
    private static void findTripletSum(Integer[] arr, Integer sum) {
        int count = 0;
        if (arr.length < 3) {
            System.out.println("The array doesn't have 3 elements");
        }
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Triplet with given sum are " + count + " in number");
    }

    //displays element of array
    private static void displayArrayElement(Integer[] arr) {
        System.out.println("the elements of array are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //reads array elements from user
    private static Integer[] readArrayElement(Integer size) {
        System.out.println("Enter " + size + " elements of array");
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

}
