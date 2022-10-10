package org.example.datastructures.arrays;
import java.util.Scanner;

/*
This is a class which finds out the element whose left and right sum are equal.
The index of this element is called pivot element.
If there is pivot element it returns it otherwise it returns -1.
eg- [1 2 5 3] here 2 is pivot element
The sum to the right side of first element and the left hand side of the element is zero.
eg-[5 1 -1] 0 is pivot element or eg- [1 -1 5]
 */
public class FindingPivotSumElement {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int start=0, index;
        for(index =0; index<nums.length; index++ ){
            sum = sum - nums[index];
            if(sum ==start){
                return index;
            }
            start = start +nums[index];
        }

        return  -1;
    }

    public static void main(String[] args) {
        FindingPivotSumElement solution = new FindingPivotSumElement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want in array");
        int number = sc.nextInt();
        int [] array = new int[number];
        System.out.println("Enter the element of the array");
        for(int i=0; i<number; i++){
            array[i]= sc.nextInt();
        }
        System.out.println(solution.pivotIndex(array));
    }
}
