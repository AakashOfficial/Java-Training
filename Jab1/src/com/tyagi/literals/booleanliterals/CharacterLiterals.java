/**
 * 
 */
package com.tyagi.literals.booleanliterals;

/**
 * @author HP
 *
 */
public class CharacterLiterals {

	/**
	 * 
	 */
	public CharacterLiterals() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch1 = 'A'; // Valid
		// Character value should not be null default is Blankspace
		// char ch2='';//Error: Empty Char Lit.
		//Character has Only One
		// char ch3='AB';//
		char ch4 = '*';
		char ch5 = '7';// Number can be assign in Character 
		System.out.println(ch1);

		System.out.println(ch4);
		System.out.println(ch5);
		//Blank Space is Default we assign to it
		char ch6 = ' ';// One Space 
		
		char ch7 = '	';// Tab key
		// This error is due to that the default value of char is Blank Space( )
		// char ch8='';//Multiple Spaces 
		
		// char ch9=''';
		char ch10 = '\'';
		// char ch11='\p';  // Invalid Escape Sequence Valid are \n \t \b \f \r \\ \" \'
		char ch12 = '\u0045';
		System.out.println(ch12);
		char ch13 = '\u00cf';
		System.out.println(ch13);
		// char ch14=-1;
		char ch15 = 65;
		System.out.println(ch15);
		char ch16 = 198;
		System.out.println(ch16);
		char ch17 = 65535;
		System.out.println("\n-------");
		for (char ch = 0; ch <= 255; ch++) {
			int x = ch; // Assign the value to a variable of type integer 
			System.out.print(x);
			// System.out.print(ch);
			
			System.out.print('\t');// This is For Printing a Tab Space
			System.out.println(ch);// This is For Printing the Character by using the ASCII Value
			System.out.println();// This is for print Blank Line
		}
	}

}

/*
==========================================================================================
char ch9=''';

In single quote can we write only one single quote
*
*/