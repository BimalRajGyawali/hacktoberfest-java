package org.example.leetcode;
public class MaxStackSum {
    public static void main(String[] args) {
        int [] s1 = {4,2,3};
        int [] s2 = {1,1,2,3};
        int [] s3 = {1,4};
        int n1 = 3 , n2 = 4, n3 = 2;
        int sum1 = 0 , sum2= 0, sum3 = 0;
        for(int i = 0 ; i<n1 ; i++){
           
            sum1 += s1[i];
        }
        for(int i = 0 ; i<n2 ; i++){
            
            sum2 += s2[i];
        }
        for(int i = 0 ; i<n3 ; i++){
            
            sum3 += s3[i];
        }
        
       int i = 0,j= 0,k= 0;
        while(sum1 != sum2 || sum2 != sum3){
           int mini = Math.max(sum1,Math.max(sum2,sum3));
        
            if(sum1==mini){
               
                sum1 = sum1 - s1[i++];
                }
               
           else if(sum2==mini){
                 sum2 = sum2 - s2[j++];
               
                
            }
            else if(sum3==mini){
                 sum3 = sum3 - s3[k++];
               
               
            }
         
        }
        System.out.print(sum1);
    }
}
