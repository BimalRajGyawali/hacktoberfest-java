package org.example.basics;

class Search2dArray {
   
    public static void main(String [] args){
        // creating a 2d array
        int[][] array1 = {
            {1,2,3,4,5},
            {20,13,24,67 }, 
            {76,101, 167,277,87}
        };
       int target = 167;
    
        
    
     System.out.println("Searching the target  in the given 2d array");
     System.out.println(maxSearch(array1,target));
 

    }
    static boolean maxSearch(int[][]arr,int target){
       
        if(arr.length==0){
           return false;
        }
        for(int i = 0 ; i<arr.length;i++){
            for(int j = 0;j<arr[i].length ;j++){
                if(arr[i][j]==target){
                   return true;
                }
            }
        }
        
        return false;

    }
}
