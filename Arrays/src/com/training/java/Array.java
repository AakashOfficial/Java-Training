package com.training.java;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		// For Static array
		/*Scanner s= new Scanner(System.in);
		int saini[] = new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter Number : "+i);
			saini[i]=s.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("Element :" + i + "->" + saini[i]);
			// System.out.println(saini[i]);
		}*/
		
		// For Creating Dynamic Array
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The size of the Array");
		int size = s.nextInt();
		int arr[] = new int[size];		
		for(i=0;i<size;i++) {
			System.out.println("Enter Element : " + i);
			arr[i] = s.nextInt();
		}
		
		for(i=0;i<size;i++) {
			System.out.println("Element :" + i + "->" + arr[i]);
			// System.out.println(arr[i]);
		}
	}

}
