/**
 * 
 */
package com.tyagi.literals.booleanliterals;

/**
 * @author HP
 *
 */
public class RelationalOperator {

	/**
	 * 
	 */
	public RelationalOperator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ABC";
		RelationalOperator test=new RelationalOperator ();
		//System.out.println(str==test);
		Object obj=str;
		System.out.println(obj==test);
		System.out.println(obj==str);
		obj=test;
		System.out.println("------");
		System.out.println(obj==test);
		System.out.println(obj==str);

	}

}
