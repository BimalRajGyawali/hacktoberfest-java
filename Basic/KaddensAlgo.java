public class KaddensAlgo {
    public static void main(String[] args) {
        int[] n = {-9,4,7,-4,6,8,6};
        int maxSum=Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < n.length; i++) {
            currentSum += n[i];
            if (maxSum<=currentSum) {
                maxSum= currentSum;
            }
            if (currentSum<0) {
                currentSum=0;
            }
        }
        System.out.println(maxSum);
    }    
}
