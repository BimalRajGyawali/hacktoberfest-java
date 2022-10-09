package org.example.algorithms;
public class  CheckArraySortedNot{
    

public static boolean arraySorted(int array[], int i)

{
if(i == array.length-1)
{
    return true;
}


    if(array[i] > array[i+1])
    {
        return false;
    }

    return arraySorted(array, i+1);



}
    public static void main(String[] args) {
    
        int array[] = {2,4,9,8};

        System.out.println(arraySorted(array, 0));

    }


}
