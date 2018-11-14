package com.tyagi.Program10.PythagoreanTriplet;

public class PythogoreanFunctions {

	int range;
	public PythogoreanFunctions(int range) {
		// TODO Auto-generated constructor stub
		this.range = range;
	}
	
	void PythagoreanTriplet(int range) {
		/*for(int i = 1 ; i <= range ; i++) {
			for(int j = i+1 ; j < range ; j++) {
				for(int k = j+1 ; k < range ; k++) {
					if( ( (i*i)+(j*j)==(k*k) ) || ( (i*i)+(k*k)==(j*j) ) || ( (k*k)+(j*j)==(i*i) ) ){
						System.out.println("Pythogorean Triplet : " + i+ " , " +j + " , " + k);
					}
				}
			}
		}*/
		
		for(int i = 1 ; i <= range ; i++) {
			for(int j = 1 ; j < range ; j++) {
				int a = (j*j) - (i*i);
				int b = 2 *i*j;
				int c = (i*i) + (j*j);
				
			}
		}
	
	}
	
}
