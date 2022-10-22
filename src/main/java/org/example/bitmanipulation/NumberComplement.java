package org.example.bitmanipulation;

public class NumberComplement {

    public int findComplement(int num) {
        int c=0,temp=num;

        while(num>0){
            c=c << 1;
            c=c^1;
            num =num >> 1;
        }
        return c ^ temp;
    }
    public static void main(String[] args) {
        int n=5;
        NumberComplement obj = new NumberComplement();
        System.out.println("Complement of Number is : "+obj.findComplement(n));
    }
}
