package com.tyagi.Program8.CountNumberOfTargetCharacter;

public class StringUtility {

	char str[];
	int countfreq = 0;
	char searching;
	String caseSensitive;		
	public StringUtility(char str[], char searching, String caseSensitive ) {
		// TODO Auto-generated constructor stub
		this.str = str;
		this.searching = searching;
		this.caseSensitive = caseSensitive;
	}

	int count(char str[], char searching) {
		
		for(int i = 0 ; i < str.length ; i++) {
			if( searching == str[i] ) {
				countfreq++;
			}
		}
		return countfreq;
	}
	
	int count(char str[], char searching,String caseSensitive ) {
		
		
		return countfreq;		
	}
}