package org.example.algorithms;
public class FactorialNNumber {
    
    public static int Factorial(int n)
    {
    
if(n == 0)
{
    return 1;
}

int FactorialNM1 = Factorial(n-1); //---> Factorial(n-1);

int FactorialN = n * FactorialNM1;

return FactorialN;


    }
public static void main(String[] args) {
        
int n = 5;

System.out.println( Factorial(n));

 }
}
