package com.tyagi.Program9.Sorting;

public class SortingFunction {

	int arr[], array[];

	public SortingFunction(int arr[]) {
		// TODO Auto-generated constructor stub
		this.arr = arr;
	}

	int[] bubbleSort(int arr[]) {
		int len = arr.length, tmp;
		boolean flag;
		for (int i = 0; i < len; i++) {
			flag = false;
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					flag = true;
				}
			}
			if (!flag)
				break;
		}

		return arr;
	}

	int[] decendingbubblesort(int arr[]) {

		int len = arr.length, tmp;
		boolean flag;
		for (int i = 0; i < len; i++) {
			flag = true;
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					flag = false;
				}
			}
			if (!flag)
				break;
		}

		return arr;

	}

	void printSortedArray(int array[]) {
		System.out.println("\nThe sorted array : ;");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

}