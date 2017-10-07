package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n;
			n= scan.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = scan.nextInt();
			

				long startTime = System.nanoTime();
				quicksort(arr,0,n-1);
				long endTime   = System.nanoTime();
				long totalTime = endTime - startTime;
				System.out.println("quick sort: " + totalTime);
				
				System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void quicksort(int[] arr, int p, int r) {
		if(p<r){
			int q = partition(arr,p,r);
			quicksort(arr,p,q-1);
			quicksort(arr,q+1,r);
		}
	}

	private static int partition(int[] arr, int p, int r) {
		int pivot = r;
		
		int i =p-1;
		for(int j = p;j<r;j++){
			if(arr[j]<arr[pivot]){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,pivot);
		
		
		return i+1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp =arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
