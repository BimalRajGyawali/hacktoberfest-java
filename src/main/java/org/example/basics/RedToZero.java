/*
    Given an integer num, return the number of steps to reduce it to zero. 
    In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
*/
package org.example.basics;

import java.util.*;

public class SumOfArray
{

    public int numberOfSteps(int num) {
        int r = count(num, 0);
        return r;
    }
    static int count(int n, int c)
    {
        if(n==0)
        return c;
        if(n%2==0)
        return count(n/2, c+1);
        else
        return count(n-1, c+1);
    }
}

