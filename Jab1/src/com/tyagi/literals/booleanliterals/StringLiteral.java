/**
 * 
 */
package com.tyagi.literals.booleanliterals;

/**
 * @author HP
 *
 */
public class StringLiteral {

	/**
	 * 
	 */
	public StringLiteral() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st1 = "";
		String st2 = "A";
		String st3 = "somabcdef%^(&";
		System.out.println(st1);
		System.out.println(st2);

		System.out.println(st3);
		String st4 = "N65M\u00cfTR";
		System.out.println(st4);
		String st5 = "N65M\\u00cfTR";
		System.out.println(st5);
		String st6 = "D:\test\b40\new";
		System.out.println(st6);
		String st7 = "D:\\test\\b40\\new";
		System.out.println(st7);
		String st8 = "HELLO\rUP";
		System.out.println(st8);
		// String st9="D:\core\pack\java";
		String st10 = "D:\\core\\pack\\java";
		System.out.println(st10);
	}

}
