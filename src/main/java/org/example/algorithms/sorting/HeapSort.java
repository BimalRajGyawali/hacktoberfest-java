// Java program for implementation of Heap Sort
//contributed by @whyanujjwhy

//time complexity: nlogn    
//auxiliary space: constant
package org.example.algorithms.sorting;
public class HeapSort {
	public void sort(int arr[])
	{
		int size = arr.length;
		for (int i = size / 2 - 1; i >= 0; i--)
			heapify(arr, size, i);

		for (int i = size - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	
	void heapify(int arr[], int size, int i)
	{
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		
		if (l < size && arr[l] > arr[largest])
			largest = l;

		if (r < size && arr[r] > arr[largest])
			largest = r;

		
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			
			heapify(arr, size, largest);
		}
	}

	
	static void printArray(int arr[])
	{
		int size = arr.length;

		for (int i = 0; i < size; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	
	public static void main(String args[])
	{
		int arr[] = { 60, 40, 20, 30, 50, 90, 80, 10, 70 };
		int size = arr.length;

		HeapSort obj = new HeapSort();
		obj.sort(arr);

		System.out.println("Sorted array is: ");
		printArray(arr);
	}
}
