/*
 * 
 */
package com.tyagi.Program9.Sorting;

import java.util.Scanner;
/**
 * @author aakas
 *
 */
public class BubbleSort {

	/**
	 * 
	 */
	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	
	public static void main(String args[]) {
    	// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        SortingFunction SF = new SortingFunction(arr);
        //int array[] = SF.bubbleSort(arr);
        int arrays[] = SF.decendingbubblesort(arr);
        //SF.printSortedArray(array);
        SF.printSortedArray(arrays);
    }

}




