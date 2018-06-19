/**
 * 
 */
package com.java.JavaTraining.OOPS;

/**
 * @author HP
 *
 */
public class OOP1 {

	/**
	 * 
	 */
	public OOP1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodService serv = new MethodService();
		serv.show('A');
		byte by1 = 123;
		serv.show(123);
		serv.show(by1);
		//serv.show(123L); //This Datatype is not applicable with Long
		//serv.display(123); //This Take 123 as a Integer not as a byte(By default parameter pass as an Integer)
		serv.display((byte)123);
		//String s1=new String("Hello");
		String s2="Hello Again";
		//System.out.println(s1);
		System.out.println(s2);
		
		for(int i=11;i<10;i++) {
			System.out.println(i);
		}
	}

}

class MethodService {

	void show(int ab) {
		System.out.println("-show(int)\t: " + ab);
	}

	void display(byte b1) {
		System.out.println("-show(byte)\t: " + b1);
	}

}
