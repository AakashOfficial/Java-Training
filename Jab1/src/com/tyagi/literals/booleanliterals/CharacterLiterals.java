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

		char ch1 = 'A';
		
		// char ch2='';//Error: Empty Char Lit.
		//Character has Only One
		// char ch3='AB';//
		char ch4 = '*';
		char ch5 = '7';
		System.out.println(ch1);

		System.out.println(ch4);
		System.out.println(ch5);
		char ch6 = ' ';// One Space
		char ch7 = ' ';// Tab key
		// char ch8='';//Multiple Spaces
		// char ch9=''';
		char ch10 = '\'';
		// char ch11='\p';
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
			int x = ch;
			System.out.print(x);
			
			System.out.print('\t');// This is For Printing a Tab Space
			System.out.println(ch);// This is For Printing the Character
			System.out.println();// This is for print Blank Line
		}
	}

}