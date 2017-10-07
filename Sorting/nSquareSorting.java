package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class nSquareSorting {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n;
			n= scan.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = scan.nextInt();
			
				bubblesort(arr.clone(),n);
				selectionsort(arr.clone(),n);
				insertionsort(arr.clone(),n);
		}
		
	}

	private static void selectionsort(int[] arr, int n) {
		long startTime = System.nanoTime();

		for(int i=0;i<(n-1);i++){
			for(int j=(i+1);j<n;j++){
				if(arr[i]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				
				}

			}
			
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Selecion sort in:" + totalTime);

	}

	private static void bubblesort(int[] arr, int n) {
		long startTime = System.nanoTime();

		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
			
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Bubble sort in:" + totalTime);
		
		
	}
	
	
	
	private static void insertionsort(int[] arr,int n){
		long startTime = System.nanoTime();
		for(int i=1;i<n;i++){
		int key = arr[i];
		int j=i-1;

		//int arr[i] in between sorted sequence of arr[0]--arr[j]
		while(j>=0 && arr[j]>key)
		{
			arr[j+1]= arr[j];
			j--;
		}
		arr[j+1]= key;
	}	
	long endTime   = System.nanoTime();
	long totalTime = endTime - startTime;
	System.out.println("Insertion sort in:" + totalTime);

	System.out.println(Arrays.toString(arr));

	}
	
	
	

}
