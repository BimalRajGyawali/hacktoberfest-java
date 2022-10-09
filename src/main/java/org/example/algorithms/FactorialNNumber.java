package org.example.algorithms;
public class FactorialNNumber {
    
    public static int factorial(int n)
    {
    
if(n == 0)
{
    return 1;
}

int factorialNM1 = factorial(n-1); //---> Factorial(n-1);

int factorialN = n * factorialNM1;

return factorialN;


    }
public static void main(String[] args) {
        
int n = 5;

System.out.println( factorial(n));

 }
}
