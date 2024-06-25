package com.beyond.sort.practice;

import java.lang.runtime.TemplateRuntime;

public class ArraySort {
	public static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			int j = i-1;
			
			for(;j>=0 && array[j]>key;j--) {
				array[j+1] = array[j];
			}
			array[j+1] = key;
		}
	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length -1 -i; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	// 작업 중에 자기 자신을 호출하는 것을 재귀 호출이라고 한다.
	// 재귀 호출을 하는 함수(메소드)를 재귀 함수(메소드)라고 한다.
	public static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int mid = (left + right)/2;
			
			// 왼쪽 부분 배열
			mergeSort(array, left, mid);
			
			// 오른쪽 부분 배열
			mergeSort(array, mid+1, right);
			
			// 정렬된 두 부분 배열을 합치는 메소드
			merge(array, left, mid, right);
		}
	}

	private static void merge(int[] array, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];	// 임시 배열 생성
		int i = left; // 왼쪽 부분 배열의 시작 인덱스
		int j = mid + 1; // 오른쪽 부분 배열의 시작 인덱스 
		int k = 0; // 임시 배열의 인덱스
		
		// 두 부분 배열의 요소를 비교하여 임시 배열에 정렬하여 저장
		while (i <= mid && j <= right ) {
			if(array[i] <= array[j]) {
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}
		}
		
		// 왼쪽 부분 배열에 남아 있는 요소가 있으면 임시 배열에 저장
		while (i <= mid) {
			temp[k++] = array[i++];
			
		}
		
		// 오른쪽 부분 배열에 남아 있는 요소가 있으면 임시 배열에 저장
		while (j <= right) {
			temp[k++] = array[j++];
		}
		
		// 임시 배열의 요소들을 원래 배열에 저장
		for (k = 0; k < temp.length; k++) {
			array[left + k] = temp[k];
		}
		
	}


	public static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(array, left, right);
			
			// pivot을 기준으로 왼쪽 부분 배열 정렬
			quickSort(array, left, pivotIndex -1);
			
			// pivot을 기준으로 오른쪽 부분 배열 정렬
			quickSort(array, pivotIndex + 1, right);
		}
	}

	private static int partition(int[] array, int left, int right) {
		int pivot = array[right];
		int i = left - 1;
		int temp = 0;
		
		// 배열을 탐색하면서 pivot보다 작은 요소를 왼쪽으로 이동시킨다.
		for (int j = left; j < right; j++) {
			if (array[j] < pivot) {
				i++;
				
				temp = array[i];
				
				array[i] = array[j];
				array[j] = temp;
				
			}
		}
		
		temp = array[i+1];
		
		array[i+1] = array[right];
		array[right] = temp;
		
		return i+1;
	}
}
