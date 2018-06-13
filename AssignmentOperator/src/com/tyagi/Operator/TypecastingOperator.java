package com.tyagi.Operator;

public class TypecastingOperator {

	public static void main(String arg[]) {
		int xy = 19;
		// byte by1=xy;
		byte by2 = (byte) xy;
		System.out.println(by2);
		int ab = 65;
		// char ch=ab;
		char ch2 = (char) ab;
		System.out.println(ch2);
		// int mn=123.456;
		int res = (int) 123.456;
		System.out.println(res);
		int rt = 5476;
		byte by4 = (byte) rt;
		System.out.println(by4);
		long val = 5476;
		byte by5 = (byte) val;
		System.out.println(by5);
		int bd = 300;
		byte by6 = (byte) bd;
		System.out.println(by6);
		int de = 428;
		byte by7 = (byte) de;
		System.out.println(by7);
		byte r1 = 10;
		byte r2 = 12;
		// byte r3=r1+r2;
		byte r4 = (byte) (r1 + r2);
		System.out.println(r4);
		// String st=(String)10;
		// int n1=(int)true;
		// boolean bol1=(boolean)0;
	}
}