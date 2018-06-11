package com.tyagi.literals.booleanliterals;

/**
 * @author HP
 *
 */
public class BooleanLiterals {

	public static void main(String arg[]) {
		System.out.println("Program Of Boolean Literals");
		boolean b1 = true;
		boolean b2 = false;
		if (b1)
			System.out.println("If Part True");
		else 
			System.out.println("Else Part");
       
		Boolean b5 = true;
		Boolean b6 = false;
		if (b5)
			System.out.println("b5 is Boolean ref. Type");
		else
			System.out.println("Else Part");
		
		/*int a=10;
		Int b=20;
		System.out.println(a);
		System.out.println(b);*/
	}
}
/*

==========================================================================================

Output :- 
 
Program Of Boolean Literals
If Part True
b5 is Boolean ref. Type

The b5 and b6 is declare due to Wrapper Class and due to this value is assigned */
