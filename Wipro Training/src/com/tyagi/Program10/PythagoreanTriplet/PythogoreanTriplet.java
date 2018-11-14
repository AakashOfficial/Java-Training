/**
 * 
 */
package com.tyagi.Program10.PythagoreanTriplet;

import java.util.Scanner;

import com.tyagi.Program10.PythagoreanTriplet.PythogoreanFunctions;
/**
 * @author aakas
 *
 */
public class PythogoreanTriplet {

	/**
	 * 
	 */
	public PythogoreanTriplet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Range to find Pythagorean Triplet");
		int range = s.nextInt();
		
		PythogoreanFunctions PF = new PythogoreanFunctions(range);
		PF.PythagoreanTriplet(range);

	}

}
