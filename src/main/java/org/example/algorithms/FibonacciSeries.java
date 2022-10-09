package org.example.algorithms;
public class FibonacciSeries {
    
public static int Fibonacci(int n)
{
    if(n == 0 || n == 1)
    return n;

    int fibNM1 = Fibonacci(n-1);
    int fibNM2 = Fibonacci(n-2); 
    int fibN = fibNM1 + fibNM2;

    return fibN;
}


    public static void main(String[] args) {
        
int n = 5;

System.out.println(Fibonacci(n));

    }
}
