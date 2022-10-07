public class LargestNumOfAnArray {

	public static void main(String[] args) {
		
		int [] numbers = {5,9,8,3,6,10,15}; // create an integer array and called it as numbers
		int largest = numbers[0];
		
		for(int num:numbers) {
			if(largest<num)
				largest=num;
		}
		System.out.println("Largest Number of the Array " +largest);
	
	}