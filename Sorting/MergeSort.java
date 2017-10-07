package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

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
				mergesort(arr,0,n-1);
				long endTime   = System.nanoTime();
				long totalTime = endTime - startTime;
				System.out.println("merge sort: " + totalTime);
				
				System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void mergesort(int[] arr, int p,int r) {
		if(p<r){
			int q = (p+r)/2;
			mergesort(arr,p,q);
			mergesort(arr,q+1,r);
			merge(arr,p,q,r);
		}
		
		
	}

	private static void merge(int[] arr, int p, int q, int r) {
	int n1 = q-p+1;
	int[] arr1 = new int[n1];
	
	int n2 = r-q;
	int[] arr2 = new int[n2];	
	
	for(int i=0;i<n1;i++)
		arr1[i] = arr[p+i]; 

	for(int i=0;i<n2;i++)
		arr2[i] = arr[q+1+i];
	
	
	int i =0;
	int j=0;
	int k =p;
	
	while(i<n1  &&j<n2){
		if(arr1[i] <= arr2[j]){
			arr[k] = arr1[i];
			i++;
		}
		else{
			arr[k] = arr2[j];
			j++;
		}
		k++;
	}
	
	
	
	}
}
