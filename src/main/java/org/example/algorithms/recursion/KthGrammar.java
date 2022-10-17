package org.example.algorithms.recursion;

public class KthGrammar {

    public static void main(String[] args){
        kthGrammar(3,3);
    }
    public static int kthGrammar(int n, int k) {

        if(n==1 && k==1){
            return 0;
        }
        int mid=(int)Math.pow(2,n-1)/2;
        if(k<=mid){
            return kthGrammar(n-1,k);
        }else{
            int l=kthGrammar(n-1,k-mid);
            if(l==0) {
                l=1;
            }else {
                l=0;
            }
            return l;
        }

    }


}

