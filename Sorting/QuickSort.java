package prac;

import java.util.*;

public class roughwork {
	
	
	public static void main(String[] args) {
		
		int arr[]= {6,3,9,5,2,8,7};
		
		int l  = 0;
		int r = arr.length-1;
		
		quicksort(arr,l,r);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		
	}
	
	public static void quicksort(int[] arr , int l , int r) {
		
		if(l<r) {
			
			int pivot = partition(arr,l,r);
			
			quicksort(arr,l,pivot-1);
			quicksort(arr,pivot+1,r);
		}
	}
	
	public static int partition(int[] arr , int l , int r) {
		int pivot  = arr[r];
		int i = l-1;
		int j = l;
		
		for(;j<=r-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		i++;
		swap(arr,i,j);
		return i;
	}
	
	public static void swap(int arr[] , int i , int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j] = temp;
	}
}

