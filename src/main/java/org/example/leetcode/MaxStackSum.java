package org.example.leetcode
public class MaxStackSum {
    public static void main(String[] args) {
        int [] S1 = {4,2,3};
        int [] S2 = {1,1,2,3};
        int [] S3 = {1,4};
        int N1 = 3 , N2 = 4,N3 = 2;
        int sum1 = 0 , sum2= 0, sum3 = 0;
        for(int i = 0 ; i<N1 ; i++){
           
            sum1 += S1[i];
        }
        for(int i = 0 ; i<N2 ; i++){
            
            sum2 += S2[i];
        }
        for(int i = 0 ; i<N3 ; i++){
            
            sum3 += S3[i];
        }
        
       int i = 0,j= 0,k= 0;
        while(sum1 != sum2 || sum2 != sum3){
           int mini = Math.max(sum1,Math.max(sum2,sum3));
       
            if(sum1==mini){
               
                sum1 = sum1 - S1[i++];
                }
               
           else if(sum2==mini){
                 sum2 = sum2 - S2[j++];
               
                
            }
            else if(sum3==mini){
                 sum3 = sum3 - S3[k++];
               
               
            }
         
        }
        System.out.print(sum1);
    }
}
