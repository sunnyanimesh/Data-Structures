package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {

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
				heapsort(arr,n);
				long endTime   = System.nanoTime();
				long totalTime = endTime - startTime;
				System.out.println("heap sort: " + totalTime);
				
				System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void heapsort(int[] arr, int n) {
		for(int i = (n/2)-1 ;i>=0;i--){
		heapify(arr,i,n);			
		}
		
		for(int i=0;i<n;i++){
			swap(arr,i,n-i-1);
			heapify(arr,0,n-i-1);
		}
		
		
	}
	
	private static void heapify(int[] arr,int i ,int n){
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && arr[l]>largest){
			largest =l;
		}
		if(r<n && arr[r]>largest){
			largest =r;
		}
		
		if(largest!= i){
			swap(arr,i,largest);
			
			heapify(arr,largest,n);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp =arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}


}
