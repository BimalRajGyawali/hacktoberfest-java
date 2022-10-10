package org.example.patterns;

public class CharacterPattern {
    
public static void main(String[] args) {
int n = 4; 
char ch = 'A';

for(int line = 1; line <= n ; line++)
{
    for(int charcter=1; charcter <= line ; charcter++)
    {
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}

}

}

// Output:
// Enter the numbers of rows:4
// A
// BC
// DEF
// GHIJ
