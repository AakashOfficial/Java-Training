/**
 * 
 */
package com.tyagi.Program8.CountNumberOfTargetCharacter;

import java.util.Scanner;

import com.tyagi.Program8.CountNumberOfTargetCharacter.Program;

/**
 * @author aakas
 *
 */
public class Program {

	/**
	 * 
	 */
	public Program() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int frequencycounted = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter SIze of the Array");
		int size = s.nextInt();
		char array[] = new char[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter Element : " + i);
			array[i] = s.next().charAt(i);
		}
		
		System.out.println("Enter Character To Be Search");
		char check = s.next().charAt(size);
		
		System.out.println("Enter Yes or No if Searching Character is Case Sensitive");
		String caseSensitive = s.next();
		
		StringUtility su = new StringUtility(array,check,caseSensitive);
		
		// For Asking from user that this Entered Character is Case Sensitive or Not
		if(caseSensitive.equals("Yes")) {
			frequencycounted = su.count(array,check,caseSensitive);
		}else {
			frequencycounted = su.count(array, check);
		}

		System.out.println("Character " + check + "is Present " + frequencycounted + " Times");
		
		/*int test = Integer.parseInt("A");
		System.out.println(test);*/
	}

}