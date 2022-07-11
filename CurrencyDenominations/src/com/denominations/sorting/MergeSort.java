package com.denominations.sorting;

public class MergeSort {

	private static void merge(int[] array,int left, int mid, int right) {
		
		int sizeOfLeft = (mid - left) +1;
		int sizeOfRight = right - mid;
		
		int[] leftArray = new int[sizeOfLeft];
		int[] rightArray = new int[sizeOfRight];
		
		for(int index =0; index< sizeOfLeft; index++)
			leftArray[index] = array[left+index];
		for(int index =0; index< sizeOfRight; index++)
			rightArray[index] = array[mid+1+index];
		
		int i=0, j=0, k=left;
		
		while(i<sizeOfLeft && j<sizeOfRight) { 
			if(leftArray[i]<rightArray[j]) {
				array[k]=leftArray[i];
				i++;
			}
			else {
				array[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<sizeOfLeft) {
			array[k]=leftArray[i];
			i++;
			k++;
		}
		while(j < sizeOfRight) {
			array[k]=rightArray[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(int[] array, int left, int right) {
		
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(array, left, mid);
			mergeSort(array, mid+1, right);
			merge(array, left, mid, right);
		}
	}
}
